package com.bottega.pricing.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.*;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @Bean
    public NewTopic concert(){
        return TopicBuilder.name("promoter.concert").partitions(1).build();
    }

    @Bean
    public NewTopic price(){
        return TopicBuilder.name("pricing.price").partitions(1).build();
    }
}
