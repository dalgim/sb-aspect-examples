package com.dalgim.example.sb.aspect.example1.service;

import com.dalgim.example.sb.aspect.example1.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<>();
    private static AtomicLong atomicLong = new AtomicLong();

    static {
        users.add(new User(atomicLong.getAndIncrement(), "John"));
        users.add(new User(atomicLong.getAndIncrement(), "Harry"));
        users.add(new User(atomicLong.getAndIncrement(), "Jessica"));
        users.add(new User(atomicLong.getAndIncrement(), "Peter"));
        users.add(new User(atomicLong.getAndIncrement(), "Mark"));
    }

    @Override
    public Optional<User> findById(Long id) {
        System.out.println("Find by id");
        return users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst();
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
