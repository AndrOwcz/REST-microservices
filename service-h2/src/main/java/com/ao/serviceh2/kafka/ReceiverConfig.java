//package com.ao.serviceh2.kafka;
//
//import com.ao.serviceh2.hello.HelloEntity;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableKafka
//public class ReceiverConfig {
//
//    @Bean
//    public Map<String, Object> consumerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:8080");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "json");
//
//        return props;
//    }
//
//    @Bean
//    public ConsumerFactory<String, HelloEntity> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
//                new JsonDeserializer<>(HelloEntity.class));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, HelloEntity> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, HelloEntity> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//
//        return factory;
//    }
//}