package com.example.demo.listener.domain;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MailSend implements ApplicationContextAware {
    private ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
    public void sendMail(){
        context.publishEvent(new MailSeSendEvent(context,"send a email"));
    }
}
