package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/14/16.
 */
public class DispenceFood implements Command {


    FoodDispencser animalFoodDispencer;

    DispenceFood(FoodDispencser newAnimalFoodDispencer){
        animalFoodDispencer = newAnimalFoodDispencer;
    }

    @Override
    public void execute() {
        animalFoodDispencer.on();
    }

    @Override
    public void undoo() {
        animalFoodDispencer.off();
    }
}
