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

        Cat cat = new Cat();
        Log.i("numberOfLegs", "cat number of legs " + cat.NumberOfLegs + Cat.whatCatsLike());

        Lion lion = new Lion();
        lion.talk();
    }
}