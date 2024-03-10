package com.example.moduleorder.controller;

import com.example.moduleorder.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class Controller {
    private final KafkaProducer kafkaProducer;
    @Value(value = "${spring.kafka.topic}")

    private String topic;

    @GetMapping("/order")
    private void getMessage(String order) {
        kafkaProducer.send(topic, "Сделать шаурму");
    }
}
