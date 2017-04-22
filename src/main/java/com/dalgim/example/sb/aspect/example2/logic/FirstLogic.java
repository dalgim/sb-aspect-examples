package com.dalgim.example.sb.aspect.example2.logic;

import com.dalgim.example.sb.aspect.example2.architecture.BusinessLogic;
import com.dalgim.example.sb.aspect.example2.logic.input.FirstInput;
import org.springframework.stereotype.Service;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Service
public class FirstLogic implements BusinessLogic<FirstInput> {

    @Override
    public void logic(FirstInput logicInput) {
        System.out.println(">>>> do first logic...");
    }
}
