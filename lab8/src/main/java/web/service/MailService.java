package web.service;

import jakarta.mail.MessagingException;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

public interface MailService {

    @Data
    @Builder
    public static class Mail {
        @Default
        private String from = "WebShop <web-shop@gmail.com>";
        private String to, cc, bcc, subject, body, filenames;
    }

    void send(Mail mail) throws MessagingException;

    default void send(String to, String subject, String body) throws MessagingException {
        Mail mail = Mail.builder().to(to).subject(subject).body(body).build();
        this.send(mail);
    }

    void push(Mail mail);

    default void push(String to, String subject, String body) {
        this.push(Mail.builder().to(to).subject(subject).body(body).build());
    }
}
