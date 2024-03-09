package pistage.tn.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmailController {
    @Autowired
    private JavaMailSender mailSender;

    private final JavaMailSender javaMailSender;

    public EmailController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @PostMapping("/send-email")
    public String sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("maramzaafrani0@gmail.com");
        message.setSubject("New Course Added");
        message.setText("A new course has been added.");

        javaMailSender.send(message);

        return "Email sent successfully";
    }


    @PostMapping("/review")
    @ResponseBody
    public void Review() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("zaafranimaram07@gmail.com");
        message.setTo("walahamdi0@gmail.com");
        message.setText("Your reclamation has been reviewed ! We are working further to maintain the best user experience for you. Thanks for your feed-back");
        message.setSubject("Reviewed");
        mailSender.send(message);
    }
}