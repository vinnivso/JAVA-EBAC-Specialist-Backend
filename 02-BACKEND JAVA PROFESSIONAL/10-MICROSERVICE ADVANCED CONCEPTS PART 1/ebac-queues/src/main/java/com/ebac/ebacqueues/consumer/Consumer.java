package com.ebac.ebacqueues.consumer;

import com.ebac.ebacqueues.configuration.ConfigurationRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfigurationRabbitMQ.QUEUE_NAME)
public class Consumer {
    @RabbitHandler
    public void consumeMessage(String message) {
        System.out.println("Receiving message: ");
        System.out.println(message);
        System.out.println("End of Receiving message: ");
    }
}
