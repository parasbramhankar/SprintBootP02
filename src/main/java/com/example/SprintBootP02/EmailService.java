package com.example.SprintBootP02;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{

    @Override
    public String sendEmail(){
        return "Email: You got new Email";
    }
}
