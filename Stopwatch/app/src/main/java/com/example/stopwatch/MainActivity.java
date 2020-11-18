package com.example.stopwatch;
/*Handler is used to run the code in future. Post method to be executed right now*/
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int seconds = 0;
    private boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }
        runTimer();
    }

    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
    }
    public void onClickStart(View view)
    {
        running = true;
    }
    public void onClickStop(View view)
    {
        running = false;
    }
    public void onClickReset(View view)
    {
        running = false;
        seconds = 0;
    }
    private void runTimer(){
        final TextView timeView = (TextView)findViewById(R.id.time);
        final Handler handler = new Handler();
        handler.post(new Runnable(){
            @Override
            public void run() {
                int hr = seconds/3600;
                int min = (seconds%3600)/60;
                int sec = seconds%60;
                String time = String.format("%d:%02d:%02d",hr,min,sec);
                timeView.setText(time);
                if(running)
                {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });


    }


}