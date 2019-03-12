package com.example.zakaria.unisearch;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UniversityDetail extends AppCompatActivity {

    private ImageView image;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_detail);

        Bundle b = getIntent().getExtras();
        int i = b.getInt("universityIndex", 0);

        ((TextView)findViewById(R.id.textViewTitle))
                .setText(UniversityList.getInstance().getUniversity(i).getName());
        ((ImageView)findViewById(R.id.imageView)).setImageResource(UniversityList.getInstance().getUniversity(i).getImage());

        image = (ImageView) findViewById(R.id.favouriteImageView);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.ic_favorite_black_24dp);

                Bundle b = getIntent().getExtras();
                int i = b.getInt("universityIndex", 0);

                name = UniversityList.getInstance().getUniversity(i).getName();

                AddData(name);
            }
        });
    }

    public void AddData(String name) {
        if(!UniversityList.getInstance().getFavUniversityList().contains(name)) {
            UniversityList.getInstance().addToArray(name);
            Toast.makeText(getApplicationContext(), name + " added to favourites",
                    Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), name + " is already in favourites",
                    Toast.LENGTH_LONG).show();
        }
    }
}
