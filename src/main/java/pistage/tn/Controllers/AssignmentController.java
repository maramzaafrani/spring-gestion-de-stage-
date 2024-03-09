package pistage.tn.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pistage.tn.Services.AssignmentService;
import pistage.tn.Services.IAgreementService;
import pistage.tn.Services.IAssignmentService;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.InternshipAssignmentLetter;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Assignment")
@AllArgsConstructor
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;
    @PostMapping("/assignment")
    public InternshipAssignmentLetter addAssignment(@RequestBody InternshipAssignmentLetter internshipAssignmentLetter) {
        return assignmentService. addAssignment(internshipAssignmentLetter);
    }

    @GetMapping("/validationType")
    public List<String> getValidationTypes() {
        List<InternshipAssignmentLetter> agreements = assignmentService.getAllAssignment();
        List<String> validationTypes = agreements.stream()
                .filter(agreement -> agreement.getValidationType() != null) // Filtrer les accords avec un validationType non nul
                .map(agreement -> agreement.getValidationType().name())
                .collect(Collectors.toList());
        return validationTypes;
    }
}
