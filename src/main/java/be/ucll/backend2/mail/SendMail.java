package be.ucll.backend2.mail;

import jakarta.mail.MessagingException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class SendMail implements CommandLineRunner {
    private final JavaMailSender javaMailSender;

    public SendMail(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    private void sendSimpleMail() {
        final var message = new SimpleMailMessage();
        message.setFrom("admin@example.com");
        message.setTo("test@example.com");
        message.setSubject("Test");
        message.setText("Hello World");
        javaMailSender.send(message);
    }

    private void sendHtmlMail() throws MessagingException {
        final var message = javaMailSender.createMimeMessage();
        final var helper = new MimeMessageHelper(message, false);
        helper.setFrom("admin@example.com");
        helper.setTo("test@example.com");
        helper.setSubject("Test");
        helper.setText("<html><body><h1>Hello World</h1></body></html>", true);
        javaMailSender.send(message);
    }

    @Override
    public void run(String... args) throws Exception {
        sendSimpleMail();
        sendHtmlMail();
    }
}
