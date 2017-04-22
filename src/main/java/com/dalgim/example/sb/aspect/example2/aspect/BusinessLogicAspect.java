package com.dalgim.example.sb.aspect.example2.aspect;

import com.dalgim.example.sb.aspect.example2.service.EventLogger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Aspect
@Component
public class BusinessLogicAspect {

    private final EventLogger eventLogger;

    @Autowired
    public BusinessLogicAspect(EventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    @Around("execution(* com.dalgim.example.sb.aspect.example2.architecture.BusinessLogic+.logic(*))")
    public void aroundBusinessLogic(ProceedingJoinPoint method) {
        try {
            eventLogger.logEvent();
            method.proceed();
            eventLogger.logEvent();
        } catch (Throwable throwable) {
            eventLogger.logExceptionEvent();
        }
    }
}
