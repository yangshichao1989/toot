package com.example.client;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActiveMqClient {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;

    @Autowired
    private Queue queue;

    @RequestMapping("/send")
    public void send(){
    	
    	
    	System.out.println("ddddddddddddd");
        jmsTemplate.convertAndSend("topic","发送的topic数据!");
        
        System.out.println("ddddddddddddd");
        jmsTemplate.convertAndSend("queue","发送的queue数据!");
        
        System.out.println("ddddddddddddd");
    }
    @RequestMapping("/hello")
    public void hello(){
    	
    	
    	System.out.println("ddddddddddddd");
    }
}
