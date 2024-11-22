package vn.project.jobhunter.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.project.jobhunter.service.EmailService;
import vn.project.jobhunter.service.SubscriberService;
import vn.project.jobhunter.util.ApiMessage;


@RestController
@RequestMapping("/api/v1")
public class EmailController {

    private final EmailService emailService;
    private final SubscriberService subscriberService;

    public EmailController(EmailService emailService,
                           SubscriberService subscriberService) {
        this.emailService = emailService;
        this.subscriberService = subscriberService;
    }

    @GetMapping("/email")
    @ApiMessage("Send simple email")
    // @Scheduled(cron = "*/30 * * * * *")
    // @Transactional
    public String sendSimpleEmail() {
         this.emailService.sendSimpleEmail();
         this.emailService.sendEmailSync("vuvuworkplace@gmail.com", "test send email",
         "<h1> <b> hello </b> </h1>", false,
         true);
        this.subscriberService.sendSubscribersEmailJobs();
        return "ok";
    }
}
