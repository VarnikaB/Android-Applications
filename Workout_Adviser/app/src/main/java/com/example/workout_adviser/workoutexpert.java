package com.example.workout_adviser;


import java.util.ArrayList;
import java.util.List;

public class workoutexpert {
    List<String> getWorkOut (String workouttypes)
    {
        List<String> workout = new ArrayList<String>();
        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Tricep Extend");
            workout.add("Bicep Extend");
        }
        else if (workouttypes.equals("Biceps"))
        {
            workout.add("Bicep Extends");
            workout.add("Bicep Curl");
        }
        else if (workouttypes.equals("Shoulders"))
        {
            workout.add("Shoulder Rotate");
            workout.add("Shoulder Press");
        }
        return workout;
    }

}
