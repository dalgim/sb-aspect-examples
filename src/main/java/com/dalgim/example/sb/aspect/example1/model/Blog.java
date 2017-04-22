package com.dalgim.example.sb.aspect.example1.model;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public class Blog {

    private final Long id;
    private final String name;

    public Blog(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
