package com.example.icon_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        TextView textView = (TextView)findViewById(R.id.myTextView);

        boolean check = ((CheckBox) view).isChecked();

        switch(view.getId())
        {
            case R.id.tea: if(check)
                                textView.setText("Tea");
                            break;
            case R.id.milk: if(check)
                                textView.setText("Milk");

        }
    }
    public void onClicked(View view)
    {
        TextView textView = (TextView)findViewById(R.id.myView);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        switch(id)
        {
            case R.id.male:textView.setText("Male");
                            break;
            case R.id.female:textView.setText("Female");
                            break;
        }
    }
    public void showToast(View view)
    {
        CharSequence text = "This is a text";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }
}