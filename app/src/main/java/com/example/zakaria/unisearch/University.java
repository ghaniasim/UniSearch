package com.example.zakaria.unisearch;


import java.util.ArrayList;

/**
 * The type University.
 */
public class University {

    private String name;
    private int image;

    /**
     * Instantiates a new University.
     *
     * @param name the name
     */
    public University (String name) {
        this.name = name;
    }

    /**
     * Instantiates a new University.
     *
     * @param name  the name
     * @param image the image
     */
    public University (String name, int image) {
        this.name = name;
        this.image = image;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
