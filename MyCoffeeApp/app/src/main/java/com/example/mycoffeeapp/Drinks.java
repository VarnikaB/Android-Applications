package com.example.mycoffeeapp;

public class Drinks {
    private String name;
    private String desc;
    private int imageID;

    public Drinks(String name, String desc, int imageID) {
        this.name = name;
        this.desc = desc;
        this.imageID = imageID;
    }

    public static final Drinks[] drinks = {
            new Drinks("Latte","This is a simple latte", R.drawable.cof1),
            new Drinks("Cappuccino","This is a simple cappuccino", R.drawable.cof2),
            new Drinks("Filter coffee","This is a simple Filter Coffee ", R.drawable.cof4)
    };
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }
}



