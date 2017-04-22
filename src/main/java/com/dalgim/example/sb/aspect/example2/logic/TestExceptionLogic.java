package com.dalgim.example.sb.aspect.example2.logic;

import com.dalgim.example.sb.aspect.example2.architecture.BusinessLogic;
import com.dalgim.example.sb.aspect.example2.logic.input.ThirdInput;
import org.springframework.stereotype.Service;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Service
public class TestExceptionLogic implements BusinessLogic<ThirdInput> {

    @Override
    public void logic(ThirdInput logicInput) {
        System.out.println(">>>> do third logic...");
        throw new RuntimeException("throwing test exception");
    }
}
