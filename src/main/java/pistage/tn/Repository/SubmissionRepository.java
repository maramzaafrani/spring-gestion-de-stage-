package pistage.tn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.InternshipSubmission;

public interface SubmissionRepository extends JpaRepository<InternshipSubmission,Long> {
}
