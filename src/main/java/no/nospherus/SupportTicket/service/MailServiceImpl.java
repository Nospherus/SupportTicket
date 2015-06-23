package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.Ticket;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

/**
 * Created by terjewallem on 6/23/15.
 */
@Component
public class MailServiceImpl implements MailService {

    @Value("${email.from}")
    private String from;

    @Value("${email.message}")
    private String customMessage;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendConfirmation(Ticket ticket) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(ticket.getCustomer().getEmail());
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setSubject("New support ticket registered");
        simpleMailMessage.setText("We have registered a new support ticket for you with ticket number " + ticket.getId()
        + "\n" + customMessage);

        try {
            mailSender.send(simpleMailMessage);
            System.out.println("Successfully sent email confirmation to " + ticket.getCustomer().getEmail());
        } catch (Exception e) {
            System.out.println("Failed to sent email confirmation to " + ticket.getCustomer().getEmail() + "\n" + e.getMessage());
        }
    }
}
