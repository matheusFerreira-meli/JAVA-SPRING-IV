package com.example.javaspringiv.dto;

import com.example.javaspringiv.entity.Blog;

import java.time.LocalDateTime;

public class BlogDTO {
    String title, author;
    LocalDateTime publicationDate;

    public BlogDTO(Blog blog) {
        this.author = blog.getAuthor();
        this.publicationDate = blog.getPublicationDate();
        this.title = blog.getTitle();
    }
}
