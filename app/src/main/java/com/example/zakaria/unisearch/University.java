package com.example.zakaria.unisearch;

import android.media.Image;

public class University {

    private String name;
    private int image;

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
