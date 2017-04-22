package com.dalgim.example.sb.aspect.example1.aspect;

import com.dalgim.example.sb.aspect.example1.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimerAspectTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void timerAspectExample() throws Exception {
        blogService.deleteById(1L);
    }
}