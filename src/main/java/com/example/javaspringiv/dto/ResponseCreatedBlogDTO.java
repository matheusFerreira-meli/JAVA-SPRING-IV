package com.example.javaspringiv.dto;
import lombok.Getter;

@Getter
public class ResponseCreatedBlogDTO {
    private final String message = "Blog criado com sucesso";
    int id;

    public ResponseCreatedBlogDTO(int id) {
        this.id = id;
    }
}
