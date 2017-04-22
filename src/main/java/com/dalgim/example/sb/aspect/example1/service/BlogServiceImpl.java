package com.dalgim.example.sb.aspect.example1.service;

import com.dalgim.example.sb.aspect.example1.aspect.Timer;
import com.dalgim.example.sb.aspect.example1.model.Blog;
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
public class BlogServiceImpl implements BlogService {

    private static List<Blog> blogList = new ArrayList<>();
    private static AtomicLong atomicLong = new AtomicLong();

    static {
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog1"));
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog2"));
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog3"));
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog4"));
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog5"));
        blogList.add(new Blog(atomicLong.getAndIncrement(), "Blog6"));

    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogList.stream().filter(blog -> Objects.equals(blog.getId(), id)).findFirst();
    }

    @Override
    public List<Blog> getAll() {
        return blogList;
    }

    @Override
    @Timer
    public void deleteById(Long id) {
        findById(id).ifPresent(blogList::remove);
    }
}
