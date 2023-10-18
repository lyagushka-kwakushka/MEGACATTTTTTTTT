package com.example.javaoop;

import android.util.Log;
public abstract class Animal {
    int NumberOfLegs;
    boolean isAlive;
    abstract void draw();
    public String breathe() {
        return  "I can breathe!";
    }
}
