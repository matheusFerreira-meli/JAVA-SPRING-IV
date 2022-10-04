package com.example.javaspringiv.controller;

import com.example.javaspringiv.dto.BlogDTO;
import com.example.javaspringiv.dto.ResponseCreatedBlogDTO;
import com.example.javaspringiv.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService service;

    @PostMapping
    public ResponseEntity<ResponseCreatedBlogDTO> create(@RequestBody BlogDTO blog) {
        return new ResponseEntity<>(service.create(blog), HttpStatus.CREATED);
    }
}
