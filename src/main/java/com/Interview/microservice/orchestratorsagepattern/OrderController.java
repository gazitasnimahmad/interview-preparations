package com.Interview.microservice.orchestratorsagepattern;

/*
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderSagaOrchestrator orchestrator;

    public OrderController(OrderSagaOrchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    @PostMapping("/{orderId}")
    public ResponseEntity<String> createOrder(@PathVariable String orderId) {
        orchestrator.startOrder(orderId);
        return ResponseEntity.ok("Order Saga started for " + orderId);
    }
}
*/