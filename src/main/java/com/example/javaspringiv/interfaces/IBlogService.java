package com.example.javaspringiv.interfaces;

import com.example.javaspringiv.dto.BlogDTO;
import com.example.javaspringiv.entity.Blog;

import java.util.List;

public interface IBlogService {
    int create(BlogDTO blog);
    List<Blog> getAll();
    Blog get(int id);
}
