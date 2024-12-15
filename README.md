# Mails sturen met JavaMailServer

Dit is een simpel voorbeeldproject dat aantoont hoe de `JavaMailSender` klasse van Spring kan gebruikt worden.

In `SendMail.java` vind je een `CommandLineRunner` die een simpele mail en een complexere (HTML) mail uitstuurt.

`application.yaml` configureert hoe we moeten verbinden met de SMTP-server. SMTP is het "Simple Mail Transfer Protocol".
Dit is het protocol dat gebruikt wordt om e-mail te versturen over het Internet.

We gebruiken MailHog om dit uit te testen. MailHog is een SMTP-server die je toelaat om alle verzonden mails te zien.
De mails worden niet echt verzonden. In `compose.yaml` zie je hoe een mailhog container geconfigureerd wordt. Als je
dit start met Docker Compose kan je alle mails zien op http://localhost:8025.

Meer info over `JavaMailSender`:

- [Guide to Spring Email](https://www.baeldung.com/spring-email)
- [Spring Reference documentatie van Email](https://docs.spring.io/spring-framework/reference/integration/email.html)
