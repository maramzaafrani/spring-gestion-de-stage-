package pistage.tn.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pistage.tn.Services.RequestService;
import pistage.tn.entity.InternshipRequest;

@RestController
@RequestMapping("/api/request")
@AllArgsConstructor
public class RequestController {
    private final RequestService requestService;

    @PostMapping("/add")
    public InternshipRequest addRequest(@RequestBody InternshipRequest internshipRequest) {
        return requestService.addRequest(internshipRequest);
    }
}