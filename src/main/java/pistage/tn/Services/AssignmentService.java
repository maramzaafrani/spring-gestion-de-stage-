package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.AssignmentRepository;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.InternshipAssignmentLetter;
import pistage.tn.entity.ValidationType;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class AssignmentService implements IAssignmentService {
    AssignmentRepository assignmentRepository;
    @Override
    public InternshipAssignmentLetter addAssignment(InternshipAssignmentLetter internshipAssignmentLetter) {
        return assignmentRepository.save(internshipAssignmentLetter);
    }

    @Override
    public List<InternshipAssignmentLetter> getAllAssignment() {
        return assignmentRepository.findAll();
    }

    @Override
    public List<InternshipAssignmentLetter> getAssignmentByValidationType(ValidationType validationType) {
        return assignmentRepository.findByValidationType(validationType);
    }
}
