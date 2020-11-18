package com.example.mydataapp;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText myInput;
    TextView myText;
    myDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput = (EditText)findViewById(R.id.myInput);
        myText = (TextView)findViewById(R.id.myText);
        dbHandler = new myDBHandler(this,null,null,1);
        printDatabase();
    }
    public void printDatabase()
    {
        String dbString = dbHandler.databaseToString();
        myText.setText(dbString);
        myInput.setText("");
    }
    public void addButtonClick(View view)
    {
        Products prod = new Products(myInput.getText().toString());
        dbHandler.addProduct(prod);
        printDatabase();
    }
    public void deleteButtonClick(View view)
    {
        String inputText = myInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }
    public void clearButtonClick(View view)
    {
        dbHandler.clearProduct();
        printDatabase();
    }



}