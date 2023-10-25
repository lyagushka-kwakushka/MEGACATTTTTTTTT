package com.example.javaoop;

import android.util.Log;
public class Puma extends Cat implements Movable, Printable{
    public void talk() {
        Log.i( "talk()", "Rawr! I'm puma! my name is "+ name +
                ", and I'm " + age + " years old.");
    }

    @Override
    void draw() {
        Log.i("draw()", "Draw puma");

    }

    @Override
    public void move() {
        Log.i("move()", "Move overriden puma");
    }

    @Override
    public void print() {
        Log.i("print()", "Print puma");
    }
}
