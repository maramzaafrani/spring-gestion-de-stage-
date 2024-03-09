package pistage.tn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.InternshipRequest;

public interface RequestRepository extends JpaRepository<InternshipRequest,Long> {
}
