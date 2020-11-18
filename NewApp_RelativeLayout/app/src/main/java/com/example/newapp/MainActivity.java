package com.example.newapp;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);
        EditText username = new EditText(this);

        myLayout.setBackgroundColor(Color.RED);

        myButton.setId(1);
        myButton.setBackgroundColor(Color.GREEN);
        myButton.setText("Click Here");

        RelativeLayout.LayoutParams buttondet = new RelativeLayout.LayoutParams(
                 RelativeLayout.LayoutParams.WRAP_CONTENT,
                 RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttondet.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondet.addRule(RelativeLayout.CENTER_VERTICAL);

        username.setId(2);
        RelativeLayout.LayoutParams userdet = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        userdet.addRule(RelativeLayout.ABOVE,myButton.getId());
        userdet.addRule(RelativeLayout.CENTER_HORIZONTAL);
        /*Add margin*/
        userdet.setMargins(0,0,0,50);
        Resources r = getResources();
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        /*Above statement will give actual pixel value to be used*/
        username.setWidth(px);



        myLayout.addView(myButton, buttondet);
        myLayout.addView(username,userdet);
        setContentView(myLayout);
    }


}