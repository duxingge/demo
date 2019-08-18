package com.example.demo.conf;

import com.example.demo.listener.domain.MailSend;
import com.example.demo.listener.domain.MailSendListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class listenConfig {

    @Bean
    public MailSend mailSend(){
        return new MailSend();
    }
    @Bean
    public MailSendListener mailSendListener(){
        return new MailSendListener();
    }
}
