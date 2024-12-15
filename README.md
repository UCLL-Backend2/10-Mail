# Sending mail with JavaMailSender

This is a simple example project that shows how you can send mail with Spring's `JavaMailSender`.

`SendMail` has a `CommandLineRunner` that sends out both a simple mail and a complicated mail.

`application.yaml` configures how to connect to the SMTP server. SMTP is the "Simple Mail Transfer Protocol",
which is used for sending email.

We're using MailHog to test this out, see the `compose.yaml`. If you start it with Docker Compose
you can see the emails at http://localhost:8025.

For more info, check out this tutorial: https://www.baeldung.com/spring-email
