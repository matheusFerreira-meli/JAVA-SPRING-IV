package com.example.javaspringiv.service;

import com.example.javaspringiv.dto.BlogDTO;
import com.example.javaspringiv.entity.Blog;
import com.example.javaspringiv.interfaces.IBlogService;
import com.example.javaspringiv.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepo repo;

    @Override
    public int create(BlogDTO blog) {
        return repo.create(blog);
    }

    @Override
    public List<Blog> getAll() {
        return null;
    }

    @Override
    public Blog get(int id) {
        return null;
    }
}
