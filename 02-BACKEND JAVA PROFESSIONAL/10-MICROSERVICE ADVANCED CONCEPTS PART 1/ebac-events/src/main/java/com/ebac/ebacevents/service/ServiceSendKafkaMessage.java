package com.ebac.ebacevents.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

public class ServiceSendKafkaMessage {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.topic.name}")
    private String ebacNameTopic;

    public void sendMessage(String message) {
        System.out.println("Sending message" + message);
        kafkaTemplate.send(ebacNameTopic, message);
    }
}
