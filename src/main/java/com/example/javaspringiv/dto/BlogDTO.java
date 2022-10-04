package com.example.javaspringiv.dto;

import com.example.javaspringiv.entity.Blog;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BlogDTO {
    String title, author;
    LocalDateTime publicationDate;
    int id;

    public BlogDTO(Blog blog) {
        this.author = blog.getAuthor();
        this.publicationDate = blog.getPublicationDate();
        this.title = blog.getTitle();
    }
}
