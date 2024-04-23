package com.ebac.zookeeperclient.controller;

import com.ebac.zookeeperclient.client.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldClient hwClient;

    @GetMapping("/greetings")
    public String helloWorld() {
        return hwClient.HelloWorld();
    }
}
