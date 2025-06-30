//package com.Interview.solidprinciples.lsp.LSP.Dependencyinjectioprinciple;
//
//
//// Abstraction
//interface MessageService {
//    void sendMessage(String message);
//}
//
//// Concrete implementation
//class EmailService implements MessageService {
//    public void sendMessage(String message) {
//        System.out.println("Email sent: " + message);
//    }
//}
//
//// High-level module
//class UserController {
//    private final MessageService messageService;
//
//    // Dependency injected via constructor
//    public UserController(MessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    public void registerUser() {
//        messageService.sendMessage("Welcome!");
//    }
//}
//
//// Usage
//public class DIPSolution {
//    public static void main(String[] args) {
//        MessageService service = new EmailService();
//        UserController controller = new UserController(service);
//        controller.registerUser();
//    }
//}