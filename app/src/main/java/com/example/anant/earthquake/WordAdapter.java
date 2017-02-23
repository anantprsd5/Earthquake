package com.example.anant.earthquake;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anant on 22/2/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
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

        TextView  place = (TextView)listItemView.findViewById(R.id.place);
        place.setText(currentAndroid.getQuakeLocation());

        TextView date = (TextView)listItemView.findViewById(R.id.date);
        date.setText(currentAndroid.getQuakeDate());

        return listItemView;
    }
}
