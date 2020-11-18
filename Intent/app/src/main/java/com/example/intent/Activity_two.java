package com.example.intent;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Activity_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstData = getIntent().getExtras();
        if(firstData==null)
            return;
        String firstmessage = firstData.getString("First message");
        final TextView secondtext = (TextView)findViewById(R.id.secondtext);
        secondtext.setText(firstmessage);
    }
}