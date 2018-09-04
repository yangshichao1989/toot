package com.example.config;

import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMqTopicConfig {

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("topic");
    }
}
