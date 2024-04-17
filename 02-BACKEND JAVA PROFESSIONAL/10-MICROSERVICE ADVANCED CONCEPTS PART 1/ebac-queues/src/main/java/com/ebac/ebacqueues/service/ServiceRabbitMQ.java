package com.ebac.ebacqueues.service;

import com.ebac.ebacqueues.configuration.ConfigurationRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(ConfigurationRabbitMQ.EXCHANGE_NAME, "route.ebac.messages", message);
    }
}
