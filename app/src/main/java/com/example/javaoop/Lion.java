package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {
    public void talk() {
        Log.i("talk()", "Rawr!I'm lion! my name is " + name +
                ", and I'm " + age + " years old." + Lion.whatCatsLike());
    }
    public static String whatCatsLike(){
        return " I'm a lion and I like playing, jumping, and sometimes scratching";
    }
}
