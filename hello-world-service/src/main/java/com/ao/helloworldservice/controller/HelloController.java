package com.ao.helloworldservice.controller;

import com.ao.helloworldservice.domain.Hello;
import com.ao.helloworldservice.kafka.Sender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Sender sender;

    public HelloController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/hello")
    public Hello getHelloWordObject() {
        return new Hello("hello");
    }

    @GetMapping("/hello/kafka")
    public Hello getHelloWordObjectKafka() {
        sender.send(new Hello("hello from kafka"));
        return new Hello("hello from Kafka sent");
    }

}