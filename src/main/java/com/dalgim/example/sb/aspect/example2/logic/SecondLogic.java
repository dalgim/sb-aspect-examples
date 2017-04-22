package com.dalgim.example.sb.aspect.example2.logic;

import com.dalgim.example.sb.aspect.example2.architecture.BusinessLogic;
import com.dalgim.example.sb.aspect.example2.logic.input.SecondInput;
import org.springframework.stereotype.Service;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Service
public class SecondLogic implements BusinessLogic<SecondInput> {

    @Override
    public void logic(SecondInput logicInput) {
        System.out.println(">>>> do second logic...");
    }
}
