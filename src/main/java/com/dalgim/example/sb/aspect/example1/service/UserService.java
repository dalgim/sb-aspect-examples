package com.dalgim.example.sb.aspect.example1.service;

import com.dalgim.example.sb.aspect.example1.model.User;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
public interface UserService {

    Optional<User> findById(Long id);
    List<User> getAll();
}
