package pistage.tn.Services;

import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.InternshipAssignmentLetter;
import pistage.tn.entity.ValidationType;

import java.util.List;

public interface IAssignmentService {
    InternshipAssignmentLetter addAssignment(InternshipAssignmentLetter internshipAssignmentLetter);
    List<InternshipAssignmentLetter> getAllAssignment();
    List<InternshipAssignmentLetter> getAssignmentByValidationType(ValidationType validationType);
}
