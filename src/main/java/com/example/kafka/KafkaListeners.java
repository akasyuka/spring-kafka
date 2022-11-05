package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "akasyuka",
            groupId= "groupId"
    )
    void listener(String data) {
        System.out.println(data +  ":)");
    }
}
