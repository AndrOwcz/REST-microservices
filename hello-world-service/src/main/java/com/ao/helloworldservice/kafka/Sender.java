package com.ao.helloworldservice.kafka;

import com.ao.helloworldservice.domain.Hello;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.ao.helloworldservice.kafka.IKafkaConstants.TOPIC_NAME;

@Service
public class Sender {

    private final KafkaTemplate<String, Hello> kafkaTemplate;

    public Sender(KafkaTemplate<String, Hello> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void send(Hello hello) {
        System.out.println("sending " + hello.getMessage());
        kafkaTemplate.send(TOPIC_NAME, hello);
    }
}
