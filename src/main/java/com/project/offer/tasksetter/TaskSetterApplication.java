package com.project.offer.tasksetter;

import com.project.offer.tasksetter.entities.SpamTask;
import com.project.offer.tasksetter.services.ProducerForChangeableTask;
import com.project.offer.tasksetter.services.TaskSetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TaskSetterApplication {

    @Autowired
    TaskSetterService taskSetterService;
    @Autowired
    ProducerForChangeableTask producerForChangeableTask;

    public static void main(String[] args) {
        SpringApplication.run(TaskSetterApplication.class, args);
    }

    @PostConstruct
    public void init(){
        SpamTask spamTask = new SpamTask("MARKETING", "New Product");
        taskSetterService.setProducerService(spamTask);
        producerForChangeableTask.send("task has been changed");
    }


}
