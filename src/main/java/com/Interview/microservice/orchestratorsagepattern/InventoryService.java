package com.Interview.microservice.orchestratorsagepattern;

import org.springframework.stereotype.Service;
/*
@Service
public class InventoryService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public InventoryService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "order-events")
    public void handleInventoryRequest(String message) {
        if (!message.startsWith("INVENTORY_RESERVE")) return;

        String orderId = message.split(":")[1];
        System.out.println("Reserving inventory for " + orderId);

        // simulate success
        kafkaTemplate.send("inventory-events", "INVENTORY_SUCCESS:" + orderId);
    }

    @KafkaListener(topics = "order-events")
    public void handleRelease(String message) {
        if (!message.startsWith("ORDER_CANCEL")) return;

        String orderId = message.split(":")[1];
        System.out.println("Releasing inventory for " + orderId);
    }
}
*/