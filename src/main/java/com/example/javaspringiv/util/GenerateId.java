package com.example.javaspringiv.util;

public class GenerateId {
    private int id = 3;
    private final static GenerateId instance = new GenerateId();

    private GenerateId() {}

    public static GenerateId getInstance() {
        return instance;
    }

    public int getId() {
        return ++id;
    }
}
