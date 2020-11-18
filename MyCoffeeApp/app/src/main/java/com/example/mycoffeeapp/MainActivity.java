package com.example.mycoffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity<ItemClickListener> extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
            if(position==0)
            {
                Intent intent = new Intent(MainActivity.this, DrinksCategoryActivity.class);
                startActivity(intent);
            }
        }
    };
    ListView listView1 = findViewById(R.id.list_option);
    ListView.setOnItemClickListener(ItemClickListener)

}