package com.example.SprintBootP02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    @Autowired
    EmailService emailService;


    public Notification(EmailService emailService) {
        this.emailService = emailService;
    }

    void Display(){
        String str=emailService.sendEmail();
        System.out.println(str);
    }
}