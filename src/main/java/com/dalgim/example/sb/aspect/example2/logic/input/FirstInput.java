package com.dalgim.example.sb.aspect.example2.logic.input;

import com.dalgim.example.sb.aspect.example2.architecture.LogicInput;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public class FirstInput implements LogicInput {

    private final String blogName;
    private final String ownerLogin;

    public FirstInput(String blogName, String ownerLogin) {
        this.blogName = blogName;
        this.ownerLogin = ownerLogin;
    }

    public String getBlogName() {
        return blogName;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }
}
