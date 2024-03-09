package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.AssignmentRepository;
import pistage.tn.Repository.JournalRepository;
import pistage.tn.entity.InternshipAssignmentLetter;
import pistage.tn.entity.InternshipJournal;

@Service
@Slf4j
@AllArgsConstructor
public class JournalService implements IJournalService {
    JournalRepository journalRepository;

    @Override
    public InternshipJournal addJournal(InternshipJournal internshipJournal) {
        return journalRepository.save(internshipJournal);
    }
}
