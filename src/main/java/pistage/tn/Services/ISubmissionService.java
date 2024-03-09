package pistage.tn.Services;

import pistage.tn.entity.InternshipSubmission;

public interface ISubmissionService {
    InternshipSubmission addSubmission(InternshipSubmission internshipSubmission);
    InternshipSubmission getSubmissionById(Long id);


}
