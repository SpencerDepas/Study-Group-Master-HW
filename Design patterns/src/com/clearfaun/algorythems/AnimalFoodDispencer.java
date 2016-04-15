package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/14/16.
 */
public class AnimalFoodDispencer implements FoodDispencser {

    private int medicene = 0;



    @Override
    public void on() {
        System.out.println("pouring out food");
    }

    @Override
    public void off() {

        System.out.println("stoped pouring out food");
    }

    @Override
    public void addMediceneToFoodMix() {

        System.out.println("Adding " + medicene + "ml of medicene to food mix");
    }
}
