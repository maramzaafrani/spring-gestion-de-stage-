package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.RequestRepository;
import pistage.tn.Repository.SubmissionRepository;
import pistage.tn.entity.InternshipRequest;
import pistage.tn.entity.InternshipSubmission;

import java.io.IOException;
import java.util.Optional;

@Service
@Slf4j
public class SubmissionService implements ISubmissionService {

    private final SubmissionRepository submissionRepository;


    @Autowired
    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    public String extractTextFromPDF(byte[] pdfData) throws IOException {
        try (PDDocument document = PDDocument.load(pdfData)) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }

    public boolean checkForPlagiarism(String text) {
        // Implémentez votre logique pour vérifier le plagiat ici, par exemple :
        // Recherchez dans la base de données des soumissions avec un texte similaire
        // Pour cet exemple, retournons false pour simuler l'absence de plagiat
        return false;
    }

    @Override
    public InternshipSubmission addSubmission(InternshipSubmission internshipSubmission) {
        return submissionRepository.save(internshipSubmission);
    }

    @Override
    public InternshipSubmission getSubmissionById(Long id) {
        return submissionRepository.findById(id).orElse(null);
    }}