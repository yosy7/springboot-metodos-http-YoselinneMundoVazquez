package com.utez.config_demo.service;

import org.springframework.stereotype.Service;
import com.utez.config_demo.repository.MessageRepository;
import com.utez.config_demo.model.Message;

@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message getEnvironmentMessage() {
        return repository.getMessage();
    }
}
