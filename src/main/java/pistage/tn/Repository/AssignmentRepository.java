package pistage.tn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.InternshipAssignmentLetter;
import pistage.tn.entity.ValidationType;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<InternshipAssignmentLetter,Long> {
    List<InternshipAssignmentLetter> findByValidationType(ValidationType validationType);
    List<InternshipAssignmentLetter> findAll();
}
