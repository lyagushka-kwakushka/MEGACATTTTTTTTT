package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.*;

import java.util.ArrayList;

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
        Liza.talk();

        Puma Rita = new Puma();
        Rita.breathe();
        Rita.talk();
        Rita.isAlive = true;
        Rita.name = "Rita";
        Log.i("breathe()", "My name is " + Rita.name + " and " + Rita.breathe());
        Log.i("isAlive", String.valueOf(Rita.isAlive));

        Cat puma = new Puma();
        puma.talk();

        Cat murzik = new Lion();
        murzik.talk();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(DICKsi);
        cats.add(Rita);
        cats.add(Liza);
        cats.add(murzik);
        cats.add(puma);

        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);
        Cat cat4 = cats.get(4);

        Puma puma1 = (Puma)cats.get(1);
        puma1.talk();

        Cat cat5 = cats.get(3);
        if (cat5 instanceof Puma){
            Puma puma2 = (Puma) cat5;
            puma2.talk();
        } else{
            Log.i("intanceof", "This is not puma");
        }
    }
}