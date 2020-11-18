package com.example.mylistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(@NonNull Context context, String[] fruits) {
        super(context, R.layout.custom_row ,fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflator = LayoutInflater.from(getContext());
        View customView =  myInflator.inflate(R.layout.custom_row,parent,false);
        String single_fruit_item = getItem(position);
        TextView myText = (TextView) customView.findViewById(R.id.myText);
        ImageView myInage = (ImageView) customView.findViewById(R.id.myImage);
        myText.setText(single_fruit_item);
        myInage.setImageResource(R.drawable.apple);
        return customView;

    }
}
