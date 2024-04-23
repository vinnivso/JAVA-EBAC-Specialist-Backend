package com.ebac.ebactoggleclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/messages")
public class MessageController {
    @Value("${client.message:Hello World!}")
    private String message;

    @Value("${client.ligaDesliga:false}")
    private boolean ligaDesliga;

    @GetMapping
    public String getMessage() {
        if (ligaDesliga) {
            return this.message;
        }
        return "Function is disabled";
    }
}
