package com.dalgim.example.sb.aspect.example1.service;

import com.dalgim.example.sb.aspect.example1.model.Blog;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public interface BlogService {

    Optional<Blog> findById(Long id);
    List<Blog> getAll();
    void deleteById(Long id);
}
