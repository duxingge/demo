package com.example.demo.listener.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MailSeSendEvent extends ApplicationContextEvent {
    private String msg;
    public MailSeSendEvent(ApplicationContext source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
