package com.project.offer.tasksetter.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerForChangeableTask {

    @Value("${spring.kafka.taskChanged}")
    private String topic;


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send(topic, message);
    }
}
