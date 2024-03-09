package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.GrilleRepository;
import pistage.tn.entity.Grille;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class GrilleService implements IGrilleService {
    GrilleRepository grilleRepository;

    @Override
    public Grille addGrille(Grille grille) {
        return grilleRepository.save(grille);
    }

    @Override
    public List<Grille> getAllGrilles() {
        return grilleRepository.findAll();
    }

}
