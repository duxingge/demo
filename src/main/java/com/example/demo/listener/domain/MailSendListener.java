package com.example.demo.listener.domain;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSeSendEvent> {
    @Override
    public void onApplicationEvent(MailSeSendEvent event) {
        System.out.println(event.getMsg());
    }
}
