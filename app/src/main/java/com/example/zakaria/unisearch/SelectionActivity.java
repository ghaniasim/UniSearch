package com.example.zakaria.unisearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * The type Selection activity.
 */
public class SelectionActivity extends AppCompatActivity {

    /**
     * The Countrylist.
     */
    String [] COUNTRYLIST = {"Select Country","Finland", "Norway", "Sweden", "Denmark", "Pakistan", "Bangladesh"};
    /**
     * The Citylist.
     */
    String [] CITYLIST = {"Select City","Helsinki", "Turku", "Tampere", "Oulu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,COUNTRYLIST
        );
        Spinner countrySpinner = findViewById(R.id.country_spinner);
        countrySpinner.setAdapter(countryAdapter);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,CITYLIST
        );
        Spinner citySpinner = findViewById(R.id.city_spinner);
        citySpinner.setAdapter(cityAdapter);

    }

    /**
     * Called when the user taps the Next button  @param view the view
     */
    public void next(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}