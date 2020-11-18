package com.example.workout_adviser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private workoutexpert expert = new workoutexpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindOut(View view){
        TextView work = (TextView)findViewById(R.id.textview);
        Spinner woktype = (Spinner)findViewById(R.id.workouttype);
        String workout = String.valueOf(woktype.getSelectedItem());
        //work.setText(workout);
        List<String> workoutt = expert.getWorkOut(workout);
        StringBuilder workoutFormatted = new StringBuilder();
        for(String wor: workoutt)
        {
            workoutFormatted.append(wor).append('\n');
        }
        work.setText(workoutFormatted);
    }


}