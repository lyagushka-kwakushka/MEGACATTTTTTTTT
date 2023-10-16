package com.example.javaoop;

import android.util.Log;
import android.util.MonthDisplayHelper;

public class Cat extends Animal {
    int age;
    String name;
    final static int NumberOfLegs = 4;
    static int count = 0;
    private String breed;
    private String colour;

    String helloText;
    CatMood catMood;
    class CatMood{
        int levelOfMood;

        CatMood(){
            if (Cat.this.age<2){
                levelOfMood = 100;
            } else if (Cat.this.age>=2 && Cat.this.age < 7){
                levelOfMood = 50;
            } else if (Cat.this.age >=7){
                levelOfMood = 20;
            }
        }
    }
    static class CountResetter{
        boolean moreThan100 = false;

        CountResetter(){
            if (Cat.count > 100){
                moreThan100 = true;
            }
            if (moreThan100){
                resetCount(0);
            }
        }
        void resetCount(int value){
            Cat.count = value;
        }
    }

    public Cat(){
        this.name = "John Doe";
        this.age = -1;

        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:
                helloText = "Meow! I'm happy cat:) My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;

        }
    }

    public Cat(int age, String name, String breed, String colour) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.colour = colour;


        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:
                helloText = "Meow! I'm happy cat:) My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;
            case 50:
                helloText = "Meow! I'm cat. My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat:( My name is " + name +
                        ", and I'm " + age + " years old. I'm a " + colour + " " + breed + " cat.";
                break;

        }
    }

    public void talk() {
        Log.i( "talk()", helloText);
    }
    public void talk(int age) {
        Log.i( "talk()", "Meow! I'm " + age + " years old.");
    }
    public void talk(String hello) {
        Log.i( "talk()", "Meow!"+hello);
    }
    public static String whatCatsLike(){
        return " I like playing, jumping, and sometimes scratching";
    }



    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;
            }
            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }

        Mouse mouse = new Mouse("White",mouseWeight);

        if (mouse.weight<2){
            Log.i("cat say","I will eat you!" + mouse.mouseVoice());
        } else {
            Log.i("cat say","I afraid you!");
        }
    }
}
