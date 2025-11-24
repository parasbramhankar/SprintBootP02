package com.example.SprintBootP02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootP02Application implements CommandLineRunner {


    public final Notification notification;

    SprintBootP02Application(Notification notification) {
        this.notification = notification;
    }

    public static void main(String[] args) {
		SpringApplication.run(SprintBootP02Application.class, args);
	}

    @Override
    public void run(String... args){
        notification.Display();
    }

}