package com.utez.config_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.utez.config_demo.service.MessageService;
import com.utez.config_demo.model.Message;

@RestController
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/api/message")
    public Message getMessage() {
        return service.getEnvironmentMessage();
    }
}
