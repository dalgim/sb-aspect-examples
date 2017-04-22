package com.dalgim.example.sb.aspect.example1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Aspect
@Component
public class TimerAspect {

    @Around(value = "@within(com.dalgim.example.sb.aspect.example1.aspect.Timer) || @annotation(com.dalgim.example.sb.aspect.example1.aspect.Timer))")
    public void aroundMethodTimer(ProceedingJoinPoint method) throws Throwable {
        long startExecution = System.currentTimeMillis();
        Thread.sleep(1000); //for test
        method.proceed();
        long stopExecution = System.currentTimeMillis();
        System.out.println("Method execution time: " + (stopExecution - startExecution));
    }

}
