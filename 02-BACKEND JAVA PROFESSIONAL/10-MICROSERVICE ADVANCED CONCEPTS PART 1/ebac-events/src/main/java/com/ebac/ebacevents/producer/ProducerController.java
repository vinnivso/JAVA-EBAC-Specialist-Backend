package com.ebac.ebacevents.producer;

import com.ebac.ebacevents.service.ServiceSendKafkaMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class ProducerController {
    @Autowired
    private ServiceSendKafkaMessage serviceSendKafkaMessage;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        serviceSendKafkaMessage.sendMessage(message);
    }
}
