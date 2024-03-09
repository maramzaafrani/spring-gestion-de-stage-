package pistage.tn.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pistage.tn.Repository.RequestRepository;
import pistage.tn.entity.InternshipRequest;

@Service
@Slf4j
@AllArgsConstructor
public class RequestService  implements IRequestService {
    private final RequestRepository requestRepository;

    @Override
    public InternshipRequest addRequest(InternshipRequest internshipRequest) {
        return requestRepository.save(internshipRequest);
    }}