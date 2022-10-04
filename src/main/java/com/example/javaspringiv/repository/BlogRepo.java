package com.example.javaspringiv.repository;

import com.example.javaspringiv.entity.Blog;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BlogRepo {
    private final String linkFile = "src/main/resources/blogs.json";
    private final ObjectMapper mapper = new ObjectMapper();
    private List<Blog> blogList = new ArrayList<>();

    public BlogRepo() {
        try {
            mapper.findAndRegisterModules();
            blogList.addAll(Arrays.asList(mapper.readValue(new File(linkFile), Blog[].class)));
        } catch (Exception ex) {
            System.out.println("Falha ao ler o arquivo");
        }
    }


}
