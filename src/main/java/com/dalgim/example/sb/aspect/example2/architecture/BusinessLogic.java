package com.dalgim.example.sb.aspect.example2.architecture;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public interface BusinessLogic<T extends LogicInput> {

    void logic(T logicInput);
}
