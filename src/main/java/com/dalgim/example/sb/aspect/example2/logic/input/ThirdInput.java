package com.dalgim.example.sb.aspect.example2.logic.input;

import com.dalgim.example.sb.aspect.example2.architecture.LogicInput;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public class ThirdInput implements LogicInput {

    private String value;

    public ThirdInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
