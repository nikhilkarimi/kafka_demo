package com.example.demo.kafka.consumer;

import com.example.demo.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "kafkaTopic",groupId = "mygroup")
    public void consumeMessage(String msg){
      log.info(String.format("consuming the message from kafka topic  %s:",msg));
    }

    @KafkaListener(topics = "kafkaTopic",groupId = "mygroup")
    public void consumeJsonMessage(Student student){
        log.info(String.format("consuming the json message from kafka topic : %s", student));
    }
}
