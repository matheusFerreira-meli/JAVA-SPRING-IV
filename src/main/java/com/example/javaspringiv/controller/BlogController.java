package com.example.javaspringiv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public LocalDateTime teste() {
        return LocalDateTime.now();
    }
}
