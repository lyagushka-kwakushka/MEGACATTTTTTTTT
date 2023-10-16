package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.catchMouse(1);
        cat1.catchMouse(3);
        cat1.talk();

        Cat cat2 = new Cat(5, "Vaska", "Pipisa", "Red");
        cat2.talk();

        Cat cat3 = new Cat(8,"Murzik","bebrenskiy","white");
        cat3.talk();

        Cat cat = new Cat();
        Log.i("numberOfLegs", "cat number of legs " + cat.NumberOfLegs + Cat.whatCatsLike());

        Lion lion = new Lion();
        lion.talk();
    }
}