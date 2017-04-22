package com.dalgim.example.sb.aspect.example1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.example.dalgim.sb.aspect.example1.service.*.findById(..))")
    public void onFindByIdBefore(JoinPoint joinPoint) {
        System.out.println("Before *.findById(): " + joinPoint.getSignature().getDeclaringTypeName());
    }

    @After("execution(* com.example.dalgim.sb.aspect.example1.service.*.findById(..))")
    public void onFindByIdAfter(JoinPoint joinPoint) {
        System.out.println("After *.findById(): " + joinPoint.getSignature().getDeclaringTypeName());
    }

    @Pointcut("execution(* com.example.dalgim.sb.aspect.example1.service.*.getAll())")
    public void aroundGetAllPointcut() {
    }

    @Around("aroundGetAllPointcut()")
    public void aroundGetAll(ProceedingJoinPoint method) {
        System.out.println("Around (Before) *.getAll()");
        try {
            method.proceed();
            System.out.println("Around (After) *.getAll()");
        } catch (Throwable throwable) {
            System.out.println("Arounf (Exception) *getAll()");
        }
    }
}
