package pistage.tn.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pistage.tn.Services.AgreementService;
import pistage.tn.Services.GrilleService;
import pistage.tn.Services.IAssignmentService;
import pistage.tn.Services.IGrilleService;
import pistage.tn.entity.Grille;
import pistage.tn.entity.InternshipAssignmentLetter;

import java.util.List;

@RestController
@RequestMapping("/Grille")
@AllArgsConstructor
public class GrilleControlleur {
    @Autowired
    private GrilleService grilleService;
    @PostMapping("/add")
    public ResponseEntity<Grille> addGrille(@RequestBody Grille grille) {
        Grille newGrille = grilleService.addGrille(grille);
        return ResponseEntity.ok(newGrille);

    }
    @GetMapping("/getall")
    public  List<Grille> getAllGrilles() {
        return grilleService.getAllGrilles();
}}