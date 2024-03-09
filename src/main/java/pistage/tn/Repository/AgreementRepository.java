package pistage.tn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.ValidationType;

import java.util.List;

public interface AgreementRepository extends JpaRepository<InternshipAgreement,Long> {
    List<InternshipAgreement> findByValidationType(ValidationType validationType);
    List<InternshipAgreement> findAll();
}
