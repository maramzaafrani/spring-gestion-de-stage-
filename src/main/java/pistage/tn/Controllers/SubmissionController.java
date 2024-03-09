package pistage.tn.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pistage.tn.Services.SubmissionService;
import pistage.tn.entity.InternshipSubmission;

import java.io.IOException;

@RestController
@RequestMapping("/submission")
@AllArgsConstructor
public class SubmissionController {
    private final SubmissionService submissionService;



    @PostMapping("/upload")
    public ResponseEntity<?> uploadSubmissionAndCheckPlagiarism(@RequestParam("file") MultipartFile file, @RequestParam("report") String report) {
        try {
            byte[] pdfFile = file.getBytes();
            String extractedText = submissionService.extractTextFromPDF(pdfFile);

            if (submissionService.checkForPlagiarism(extractedText)) {
                return ResponseEntity.badRequest().body("Plagiarism detected in the submission.");
            }

            InternshipSubmission internshipSubmission = new InternshipSubmission();
            internshipSubmission.setPdfFile(pdfFile);
            internshipSubmission.setReport(report);
            InternshipSubmission savedSubmission = submissionService.addSubmission(internshipSubmission);
            return ResponseEntity.ok(savedSubmission);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @GetMapping("/{id}")
    public ResponseEntity<byte[]> downloadSubmission(@PathVariable Long id) {
        InternshipSubmission internshipSubmission = submissionService.getSubmissionById(id);
        if (internshipSubmission != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("filename", "submission.pdf");
            headers.setContentLength(internshipSubmission.getPdfFile().length);
            return new ResponseEntity<>(internshipSubmission.getPdfFile(), headers, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }}