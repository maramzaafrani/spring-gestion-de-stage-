package pistage.tn.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pistage.tn.Services.IAssignmentService;
import pistage.tn.Services.IJournalService;
import pistage.tn.Services.JournalService;
import pistage.tn.entity.InternshipAssignmentLetter;
import pistage.tn.entity.InternshipJournal;

@RestController
@RequestMapping("/Journal")
@AllArgsConstructor
public class JournalController {
    @Autowired
    private JournalService journalService;

    @PostMapping("/Journal")
    public InternshipJournal addJournal(@RequestBody InternshipJournal internshipJournal) {
        return journalService.addJournal(internshipJournal);
    }
}