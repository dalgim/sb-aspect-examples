package com.dalgim.example.sb.aspect.example2.logic.input;

import com.dalgim.example.sb.aspect.example2.architecture.LogicInput;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public class SecondInput implements LogicInput {

    private final String login;
    private final String password;

    public SecondInput(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
