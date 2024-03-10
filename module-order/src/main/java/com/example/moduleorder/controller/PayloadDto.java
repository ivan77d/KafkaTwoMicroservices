package com.example.moduleorder.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.kafka.common.protocol.types.Field;

@Getter
@Setter
@Accessors(chain = true)
public class PayloadDto {
    String topic;
    String message;
}
