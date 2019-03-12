package com.example.zakaria.unisearch;

import java.util.ArrayList;
import java.util.List;

/**
 * The type University list.
 */
public class UniversityList {
    private static final UniversityList ourInstance = new UniversityList();

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static UniversityList getInstance() {
        return ourInstance;
    }

    private List<University> universities;
    private ArrayList<String> favourite_universities = new ArrayList<String>();

    /**
     * Add.
     */
    public void add() {
        universities = new ArrayList<University>();
        universities.add(new University("University of Helsinki", R.drawable.helsinki));
        universities.add(new University("Metropolia UAS", R.drawable.metropolia));
        universities.add(new University("Haaga-Helia UAS", R.drawable.haagahelia));
        universities.add(new University("Aalto University", R.drawable.aalto));
        universities.add(new University("Laurea UAS", R.drawable.laurea));
        universities.add(new University("Diaconia UAS", R.drawable.diconia));
        universities.add(new University("Humak UAS", R.drawable.humak));
        universities.add(new University("Helsinki School of Business", R.drawable.helsinkibusiness));
        universities.add(new University("National Defense University", R.drawable.defense));
        universities.add(new University("Helsinki Design School", R.drawable.desing));
    }

    /**
     * Add to array.
     *
     * @param name the name
     */
    public void addToArray(String name) {
            favourite_universities.add(name);
    }

    /**
     * Gets fav university list.
     *
     * @return the fav university list
     */
    public ArrayList<String> getFavUniversityList() {
        return this.favourite_universities;
    }

    /**
     * Gets university list.
     *
     * @return the university list
     */
    public List<University> getUniversityList() {
        return this.universities;
    }

    /**
     * Gets university.
     *
     * @param value the value
     * @return the university
     */
    public University getUniversity(int value) {
        return this.universities.get(value);
    }

    /**
     * Gets fav university.
     *
     * @param value the value
     * @return the fav university
     */
    public String getFavUniversity(int value) {
        return this.favourite_universities.get(value);
    }
}
