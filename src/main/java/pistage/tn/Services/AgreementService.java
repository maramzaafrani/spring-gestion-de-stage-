package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.AgreementRepository;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.ValidationType;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class AgreementService implements IAgreementService {
    @Autowired
    AgreementRepository agreementRepository;


    @Override
    public InternshipAgreement addAgreement(InternshipAgreement internshipAgreement) {
        return agreementRepository.save(internshipAgreement);
    }




     @Override
    public List<InternshipAgreement> getAllAgreements() {
        return agreementRepository.findAll();
    }

    @Override
    public InternshipAgreement getInternshipAgreement(Long id) {
        return agreementRepository.findById(id).orElse(null);
    }

}

