package com.example.demo.listener.controller;

import com.example.demo.listener.domain.MailSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    MailSend mailSend;

    @RequestMapping(value = "/sendAMail")
    public String mailsend() {
        mailSend.sendMail();
        return "ok";
    }
}
