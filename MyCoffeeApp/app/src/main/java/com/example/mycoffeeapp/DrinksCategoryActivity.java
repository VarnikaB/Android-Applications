package com.example.mycoffeeapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksCategoryActivity<listAdapter> extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ListView listDrinks = getListView();

    ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
            this, android.R.layout.simple_list_item_1,Drinks.drinks
    );
    listDrinks.setAdapter(listAdapter);
}
