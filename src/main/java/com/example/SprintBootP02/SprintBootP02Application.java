package com.example.SprintBootP02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootP02Application {

    @Autowired
    public final Notification notification;

    public SprintBootP02Application(Notification notification) {
        this.notification = notification;
    }

    public static void main(String[] args) {
		SpringApplication.run(SprintBootP02Application.class, args);
	}

    public void run(String... args){
        notification.Display();
    }

}