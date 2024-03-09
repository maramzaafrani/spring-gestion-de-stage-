package pistage.tn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.Grille;

public interface GrilleRepository extends JpaRepository<Grille,Long> {
}
