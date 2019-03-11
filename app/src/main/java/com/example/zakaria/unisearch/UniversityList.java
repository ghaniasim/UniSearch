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
        universities.add(new University("University of Helsinki", R.drawable.metropolia));
//        universities.add(new University("Metropolia UAS"));
//        universities.add(new University("Haaga-Helia UAS"));
//        universities.add(new University("Aalto University"));
//        universities.add(new University("Laurea UAS"));
//        universities.add(new University("Diaconia UAS"));
//        universities.add(new University("Humak UAS"));
//        universities.add(new University("Helsinki School of Business"));
//        universities.add(new University("National Defense University"));
//        universities.add(new University("Helsinki Design School"));
    }

    public List<University> getUniversityList() {
        return this.universities;
    }

    public University getUniversity(int value) {
        return this.universities.get(value);
    }
}
