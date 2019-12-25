package com.example.dsc_onboarding.Model;

public class Mammal extends Animal {

    String family;

    @Override
    public void behaviour() {
        super.behaviour();
        System.out.println("I am a mammal");
    }
}
