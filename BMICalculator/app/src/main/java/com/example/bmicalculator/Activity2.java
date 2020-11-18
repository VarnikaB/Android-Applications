package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void calcBMI(View view)
    {
        double height = 0, weight = 0;
        double bmi = 0;
        String message="";
        EditText et1 = (EditText)findViewById(R.id.editText1);
        EditText et2 = (EditText)findViewById(R.id.editText2);

        Button b = (Button)findViewById(R.id.button2);
        TextView t1  =(TextView)findViewById(R.id.textView1);
        TextView t2  =(TextView)findViewById(R.id.textView2);
        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());
        bmi = height * height;
        bmi = weight / bmi;
        t1.setText(String.valueOf(bmi));
        if(bmi < 18.5)
             message = "Under-weight";
        else if(bmi > 18.5 && bmi<25)
            message = "Normal";
        else
            message = "Over-weight";
        t2.setText(message);



    }
}