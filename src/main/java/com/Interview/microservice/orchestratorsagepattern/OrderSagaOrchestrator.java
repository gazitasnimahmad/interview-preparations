package com.Interview.microservice.orchestratorsagepattern;

import org.springframework.stereotype.Service;
/*
@Service
public class OrderSagaOrchestrator {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OrderSagaOrchestrator(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void startOrder(String orderId) {
        System.out.println("Orchestrator: Starting Order " + orderId);
        kafkaTemplate.send("order-events", "ORDER_CREATED:" + orderId);
    }

    @KafkaListener(topics = "payment-events")
    public void handlePaymentResult(String message) {
        String[] parts = message.split(":");
        String status = parts[0];
        String orderId = parts[1];

        if (status.equals("PAYMENT_SUCCESS")) {
            kafkaTemplate.send("order-events", "INVENTORY_RESERVE:" + orderId);
        } else {
            kafkaTemplate.send("order-events", "ORDER_CANCEL:" + orderId);
        }
    }

    @KafkaListener(topics = "inventory-events")
    public void handleInventoryResult(String message) {
        String[] parts = message.split(":");
        String status = parts[0];
        String orderId = parts[1];

        if (status.equals("INVENTORY_SUCCESS")) {
            kafkaTemplate.send("order-events", "START_SHIPPING:" + orderId);
        } else {
            kafkaTemplate.send("order-events", "CANCEL_PAYMENT:" + orderId);
            kafkaTemplate.send("order-events", "ORDER_CANCEL:" + orderId);
        }
    }

    @KafkaListener(topics = "shipping-events")
    public void handleShippingResult(String message) {
        String[] parts = message.split(":");
        String status = parts[0];
        String orderId = parts[1];

        if (status.equals("SHIPPED")) {
            System.out.println("Order " + orderId + " completed successfully!");
        }
    }
}
*/