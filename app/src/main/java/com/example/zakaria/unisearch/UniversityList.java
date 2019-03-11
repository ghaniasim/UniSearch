package com.example.zakaria.unisearch;

import java.util.ArrayList;
import java.util.List;

public class UniversityList {
    private static final UniversityList ourInstance = new UniversityList();

    public static UniversityList getInstance() {
        return ourInstance;
    }

    private List<University> universities;

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

    public List<University> getUniversityList() {
        return this.universities;
    }

    public University getUniversity(int value) {
        return this.universities.get(value);
    }
}
