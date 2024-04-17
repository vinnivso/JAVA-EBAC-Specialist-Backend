package com.ebac.ebacqueues.producer;

import com.ebac.ebacqueues.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class Producer {
    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void sendMessage(@RequestBody String  message) {
        System.out.println("============= Sending Message: " + message);
        serviceRabbitMQ.sendMessage(message);
    }
}
