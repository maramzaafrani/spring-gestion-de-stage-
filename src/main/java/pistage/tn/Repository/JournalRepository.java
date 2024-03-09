package pistage.tn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pistage.tn.entity.InternshipJournal;

public interface JournalRepository extends JpaRepository<InternshipJournal,Long> {
}
