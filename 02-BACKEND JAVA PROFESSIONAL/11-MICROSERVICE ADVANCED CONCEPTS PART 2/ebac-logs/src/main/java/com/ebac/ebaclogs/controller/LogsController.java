package com.ebac.ebaclogs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/logs")
public class LogsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogsController.class);
    @GetMapping
    public String showMessage() {
        final Double message = Math.random();

        LOGGER.info("Log generated: {}", message);

        return "I said:" + message;
    }
}
