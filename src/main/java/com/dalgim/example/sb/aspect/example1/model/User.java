package com.dalgim.example.sb.aspect.example1.model;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public class User {

    private final Long id;
    private final String login;

    public User(Long id, String login) {
        this.login = login;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
}
