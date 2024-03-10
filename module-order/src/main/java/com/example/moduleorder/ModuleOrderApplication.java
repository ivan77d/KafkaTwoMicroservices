package com.example.moduleorder;

import com.example.moduleorder.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleOrderApplication.class, args);
    }

}
