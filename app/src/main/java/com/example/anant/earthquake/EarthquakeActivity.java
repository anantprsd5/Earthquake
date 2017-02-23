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
        earthquakes.add(new Word("7th July","New Delhi","8.6"));
        earthquakes.add(new Word("8th September","London","5.9"));
        earthquakes.add(new Word("9th august","Austria","4.5"));
        earthquakes.add(new Word("1st December","Texas","3.9"));

        ListView list =(ListView) findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this,earthquakes);

        list.setAdapter(adapter);

    }
}
