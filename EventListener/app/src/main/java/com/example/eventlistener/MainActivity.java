package com.example.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(

                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView myText = (TextView)findViewById(R.id.myText);
                        myText.setText("Button Clicked");
                    }
                }
        );
        myButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        TextView myText = (TextView)findViewById(R.id.myText);
                        myText.setText("Button LongClicked");
                        return true;/*false will change as soon as mouse is released*/
                    }
                }
        );
    }
}