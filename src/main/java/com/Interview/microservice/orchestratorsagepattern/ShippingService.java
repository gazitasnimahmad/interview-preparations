package com.Interview.microservice.orchestratorsagepattern;
/*
@Service
public class ShippingService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ShippingService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "order-events")
    public void handleShipping(String message) {
        if (!message.startsWith("START_SHIPPING")) return;

        String orderId = message.split(":")[1];
        System.out.println("Shipping order " + orderId);

        kafkaTemplate.send("shipping-events", "SHIPPED:" + orderId);
    }
}
*/