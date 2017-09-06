package com.epicodus.alphabetpractice;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mAppNameTextView;
    GridView gridView;
    String[] letters = new String[] {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/neo_latina.ttf");
        gridView = (GridView) findViewById(R.id.baseGridView);

        gridView.setAdapter(new AlphabetAdapter(this, letters, typeface));
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        mAppNameTextView.setTypeface(typeface);
    }
}
