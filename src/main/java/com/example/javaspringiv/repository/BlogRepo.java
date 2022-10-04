package com.example.javaspringiv.repository;

import com.example.javaspringiv.dto.BlogDTO;
import com.example.javaspringiv.entity.Blog;
import com.example.javaspringiv.util.GenerateId;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BlogRepo {
    private final String linkFile = "src/main/resources/blogs.json";
    private final ObjectMapper mapper = new ObjectMapper();
    private List<Blog> blogList = new ArrayList<>();
    GenerateId generateId;

    public BlogRepo() {
        try {
            mapper.findAndRegisterModules();
            blogList.addAll(Arrays.asList(mapper.readValue(new File(linkFile), Blog[].class)));
        } catch (Exception ex) {
            System.out.println("Falha ao ler o arquivo");
        }
        generateId = GenerateId.getInstance();
    }

    public int create(BlogDTO blog) {
        int id = generateId.getId();
        blog.setId(id);
        blogList.add(new Blog(blog.getId(), blog.getTitle(), blog.getAuthor(), blog.getPublicationDate()));

        try {
            ObjectWriter writter = mapper.writer(new DefaultPrettyPrinter());
            writter.writeValue(new File(linkFile), blogList);
        } catch (Exception ex) {
            System.out.println("Não foi possível escrever no arquivo");
        }

        return id;
    }
}
