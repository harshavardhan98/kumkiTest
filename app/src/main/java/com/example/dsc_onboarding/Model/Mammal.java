package com.example.dsc_onboarding.Model;

import android.util.Log;

public class Mammal extends Animal {

    String family;

    @Override
    public void behaviour() {
        super.behaviour();
        System.out.println("I am a mammal");
    }

    public void getHelloMammal(float x){
        Log.d("testing", "harsha1Mammal");
    }
}
