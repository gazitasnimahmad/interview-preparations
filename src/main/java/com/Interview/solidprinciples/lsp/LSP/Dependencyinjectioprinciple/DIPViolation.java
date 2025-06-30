package com.Interview.solidprinciples.lsp.LSP.Dependencyinjectioprinciple;

public class DIPViolation {
}


class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class UserController {
    private EmailService emailService = new EmailService(); // Tight coupling

    public void registerUser() {
        emailService.sendEmail("Welcome!");
    }
}