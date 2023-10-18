package com.example.javaoop;

import android.util.Log;
public class Puma extends Cat{
    public void talk() {
        Log.i( "talk()", "Rawr! I'm puma! my name is "+ name +
                ", and I'm " + age + " years old.");
    }

    @Override
    void draw() {

    }
}
