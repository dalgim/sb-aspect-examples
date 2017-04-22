package com.dalgim.example.sb.aspect.example2.service;

import org.springframework.stereotype.Service;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Service
public class BusinessEventLogger implements EventLogger {

    @Override
    public void logEvent() {
        System.out.println("*************************");
        System.out.println("* Log business event... *");
        System.out.println("*************************");
    }

    @Override
    public void logExceptionEvent() {
        System.out.println("**************************");
        System.out.println("* Log exception event... *");
        System.out.println("**************************");
    }
}
