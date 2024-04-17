package com.ebac.ebacevents.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumer {
    @KafkaListener(topics = "${kafka.ebac.topic.name}", groupId = "ebacGroup")
    public void messageConsume(String message) {
        System.out.println("Receiving message");
        System.out.println(message);
        System.out.println("End of Receiving message");
    }
}
