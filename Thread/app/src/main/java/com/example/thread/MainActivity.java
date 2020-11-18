package com.example.thread;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            TextView text = (TextView)findViewById(R.id.text);
            text.setText("Button Click");
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ClickMyButton(View view)
    {
        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                long futuretime = System.currentTimeMillis()+10000;
                while(System.currentTimeMillis()<futuretime)
                {
                    synchronized (this)
                    {
                        try {
                            wait(futuretime-System.currentTimeMillis());
                        }
                        catch(Exception e)
                        {

                        }
                    }
                }
                handler.sendEmptyMessage(0);
            }
        };
        Thread myThread = new Thread(r);
        myThread.start();



    }
}