package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/21/16.
 */
public class AnimalFeederMachene implements FeedMachine {


    @Override
    public void dispenseFood() {
        System.out.println("Disensing food for our animals");
    }

    @Override
    public void dispenseWater() {
        System.out.println("Disensing water for our animals");
    }

    @Override
    public void throwAwayOldFood() {
        System.out.println("Throwing away the old food that the animals did not eat");
    }
}
