package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(1,"Serunya", "british", "black");
        myCat.talk();

        Cat DICKsi = new Cat(4,"DiCKsi", "beach", "grey");
        DICKsi.talk();

        Cat Liza = new Cat();
        Liza.age = 8;
        Liza.name = "Liza";
        Liza.breed = "british";
        Liza.colour = "grey";
        Liza.talk();

        Puma Rita = new Puma();
        Rita.breathe();
        Rita.talk();
        Rita.isAlive = true;
        Rita.name = "Rita";
        Log.i("breathe()", "My name is " + Rita.name + " and " + Rita.breathe());
        Log.i("isAlive", String.valueOf(Rita.isAlive));
    }
}