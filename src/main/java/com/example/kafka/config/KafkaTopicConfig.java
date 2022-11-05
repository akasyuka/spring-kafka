package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic akasyukaTopic() {
        return TopicBuilder.name("akasyuka")
                .build();
    }
}
