package com.example.modulekitchen.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic}")
    public void receive(ConsumerRecord<?,?> consumerRecord) {
        log.info("Kitchen get new order: {}", consumerRecord.value().toString());
    }
}
