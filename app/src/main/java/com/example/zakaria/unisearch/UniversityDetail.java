package com.example.zakaria.unisearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UniversityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_detail);

        Bundle b = getIntent().getExtras();
        int i = b.getInt("universityIndex", 0);

        ((TextView)findViewById(R.id.textViewTitle))
                .setText(UniversityList.getInstance().getUniversity(i).getName());
    }
}
