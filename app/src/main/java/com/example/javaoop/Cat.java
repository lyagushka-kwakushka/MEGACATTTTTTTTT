package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    private String breed;
    private String colour;

    public Cat(){

    }

    public Cat(int age, String name, String breed, String colour) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    public void talk() {
        Log.i( "talk()", "Meow! my name is "+ name +
            ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.");
    }
    public void talk(int age) {
        Log.i( "talk()", "Meow! I'm " + age + " years old.");
    }
    public void talk(String hello) {
        Log.i( "talk()", "Meow!"+hello);
    }
}
