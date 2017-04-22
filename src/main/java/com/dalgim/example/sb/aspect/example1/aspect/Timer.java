package com.dalgim.example.sb.aspect.example1.aspect;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Component
@Target(value = {
        ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Timer {
}
