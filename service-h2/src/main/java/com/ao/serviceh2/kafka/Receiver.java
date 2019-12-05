//package com.ao.serviceh2.kafka;
//
//import java.util.concurrent.CountDownLatch;
//
//import com.ao.serviceh2.hello.HelloEntity;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Receiver {
//
//    private CountDownLatch latch = new CountDownLatch(1);
//
//    public CountDownLatch getLatch() {
//        return latch;
//    }
//
//    @KafkaListener(topics = "demo")
//    public void receive(HelloEntity helloEntity) {
//        System.out.println("receiving " + helloEntity.getMessage());
//        latch.countDown();
//    }
//}