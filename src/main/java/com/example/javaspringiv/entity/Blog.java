package com.example.javaspringiv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    int id;
    String title, author;
    LocalDateTime publicationDate;
}
