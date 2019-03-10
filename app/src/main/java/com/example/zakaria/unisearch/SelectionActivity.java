package com.example.zakaria.unisearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectionActivity extends AppCompatActivity {

    String [] COUNTRYLIST = {"Select Country","Finland", "Norway", "Sweden", "Denmark", "Pakistan", "Bangladesh"};
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
}