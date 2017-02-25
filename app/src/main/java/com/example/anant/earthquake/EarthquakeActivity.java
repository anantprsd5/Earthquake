package com.example.anant.earthquake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Word> earthquakes = new ArrayList<>();
        earthquakes.add(new Word("7.4","New Delhi","7th July"));
        earthquakes.add(new Word("5.6","London","8th September"));
        earthquakes.add(new Word("3.5","Austria","9th august"));
        earthquakes.add(new Word("6.5","Texas","1st December"));

        ListView list =(ListView) findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this,earthquakes);

        list.setAdapter(adapter);

    }
}
