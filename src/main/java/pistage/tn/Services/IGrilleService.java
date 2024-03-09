package pistage.tn.Services;

import pistage.tn.entity.Grille;

import java.util.List;


public interface IGrilleService {
    Grille addGrille(Grille grille);
    List<Grille> getAllGrilles();
}
