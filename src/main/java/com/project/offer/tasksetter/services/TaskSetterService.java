package com.project.offer.tasksetter.services;

import com.project.offer.tasksetter.entities.SpamTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskSetterService {

    @Autowired
    private ProducerService producerService;

    public void setProducerService(SpamTask spamTask){
        producerService.send(spamTask);
    }
}
