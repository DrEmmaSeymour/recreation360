package com.recreation360.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "parks-topic", groupId = "recreation360-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

