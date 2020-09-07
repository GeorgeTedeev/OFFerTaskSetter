package com.project.offer.tasksetter.services;


import com.project.offer.tasksetter.entities.SpamTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Value("${spring.kafka.taskerTopic}")
    private String topic;


    @Autowired
    private KafkaTemplate<String, SpamTask> kafkaTemplate;

    public void send(SpamTask spamTask){
        kafkaTemplate.send(topic, spamTask);
    }

}
