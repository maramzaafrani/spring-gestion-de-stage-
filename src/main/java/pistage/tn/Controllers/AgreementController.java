package pistage.tn.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pistage.tn.Services.AgreementService;
import pistage.tn.Services.IAgreementService;
import pistage.tn.entity.InternshipAgreement;
import pistage.tn.entity.ValidationType;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Agreement")
@AllArgsConstructor

public class AgreementController {
    @Autowired
    private AgreementService agreementService;

    @PostMapping("/agreements")
    public InternshipAgreement addAgreement(@RequestBody InternshipAgreement internshipAgreement) {
        return agreementService.addAgreement(internshipAgreement);
    }

    @GetMapping("/afficherfoyer/{idagrement}")
    InternshipAgreement getInternshipAgreement (@PathVariable("id") long agreementId) {
        return agreementService.getInternshipAgreement (agreementId);
    }
}

