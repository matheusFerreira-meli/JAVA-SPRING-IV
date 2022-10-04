package com.example.javaspringiv.service;

import com.example.javaspringiv.dto.BlogDTO;
import com.example.javaspringiv.dto.ResponseCreatedBlogDTO;
import com.example.javaspringiv.entity.Blog;
import com.example.javaspringiv.exception.NotFoundException;
import com.example.javaspringiv.interfaces.IBlogService;
import com.example.javaspringiv.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepo repo;

    @Override
    public ResponseCreatedBlogDTO create(BlogDTO blog) {
        int idCreatedBlog = repo.create(blog);
        return new ResponseCreatedBlogDTO(idCreatedBlog);
    }

    @Override
    public List<Blog> getAll() {
        return null;
    }

    @Override
    public Blog get(int id) {
        Optional<Blog> blog = repo.get(id);
        if(blog.isEmpty()) throw new NotFoundException("Blog não encontrado");

        return blog.get();
    }
}
