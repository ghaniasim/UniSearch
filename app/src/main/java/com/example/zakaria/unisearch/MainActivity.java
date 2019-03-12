package com.example.zakaria.unisearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Proceed button  @param view the view
     */
    public void proceed(View view) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivity(intent);
    }

}
