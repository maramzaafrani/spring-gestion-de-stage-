package pistage.tn.Services;


import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.InternshipSubmission;
import pistage.tn.entity.ValidationType;

import java.util.List;

public interface IAgreementService {
    InternshipAgreement addAgreement(InternshipAgreement internshipAgreement);
    List<InternshipAgreement> getAllAgreements();
    InternshipAgreement getInternshipAgreement(Long id);

}
