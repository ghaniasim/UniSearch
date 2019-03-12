package com.example.zakaria.unisearch;


import java.util.ArrayList;

public class University {

    private String name;
    private int image;
    private ArrayList<String> names = new ArrayList<>();

    public University (String name) {
        this.name = name;
    }

    public University (String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
