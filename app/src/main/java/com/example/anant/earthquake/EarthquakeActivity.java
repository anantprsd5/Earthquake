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

        ArrayList<Word> earthquakes = QueryUtils.extractEarthquakes();

        ListView list =(ListView) findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this,earthquakes);

        list.setAdapter(adapter);

    }
}
