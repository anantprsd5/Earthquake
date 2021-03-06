package com.example.anant.earthquake;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.anant.earthquake.R.id.landmark;
import static com.example.anant.earthquake.R.id.location;

/**
 * Created by anant on 22/2/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private String landmark;

    private String location;

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");
        return dateFormat.format(dateObject);
    }
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        Word currentAndroid = getItem(position);

        TextView magnitde = (TextView)listItemView.findViewById(R.id.magnitude);
        magnitde.setText(currentAndroid.getQuakeMagnitude());

        String fullLocation = currentAndroid.getQuakeLocation();
        if(fullLocation.contains("of")) {
            String[] locArray = fullLocation.split("of");
            landmark = locArray[0]+"\n Of";
            location = locArray[1];
        }

        else{
            landmark = "Near the";
            location=fullLocation;
        }

        TextView landmarkLoc = (TextView) listItemView.findViewById(R.id.landmark);
        landmarkLoc.setText(landmark);

        TextView locLoc = (TextView) listItemView.findViewById(R.id.location);
        locLoc.setText(location);


        Date dateObject = new Date(currentAndroid.getQuakeTime());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String  formattedTime = formatTime(dateObject);
        timeView.setText(formattedTime);

        return listItemView;
    }
}
