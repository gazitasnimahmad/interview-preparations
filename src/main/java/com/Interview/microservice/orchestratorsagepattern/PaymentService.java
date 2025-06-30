package com.Interview.microservice.orchestratorsagepattern;
/*
@Service
public class PaymentService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public PaymentService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "order-events")
    public void handleOrderCreated(String message) {
        if (!message.startsWith("ORDER_CREATED")) return;

        String orderId = message.split(":")[1];
        System.out.println("Processing payment for " + orderId);

        // simulate success
        kafkaTemplate.send("payment-events", "PAYMENT_SUCCESS:" + orderId);
    }

    @KafkaListener(topics = "order-events")
    public void handleCancelPayment(String message) {
        if (!message.startsWith("CANCEL_PAYMENT")) return;

        String orderId = message.split(":")[1];
        System.out.println("Refunding payment for " + orderId);
    }
}

 */