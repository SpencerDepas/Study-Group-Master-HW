package com.clearfaun.algorythems;

public class Main {

    public static void main(String[] args) {
	// write your code here


        FoodDispencser animalFoodDispencer = new AnimalFoodDispencer();

        DispenceFood dispenceFoodCommand = new DispenceFood(animalFoodDispencer);
        dispenceFoodCommand.execute();
        FoodDispencerRemote remoteForFoodDispencer = new FoodDispencerRemote(dispenceFoodCommand);


        remoteForFoodDispencer.press();
        //output pouring out food


//        DispenceFood dispenceFoodCommand = new DispenceFood(animalFoodDispencer);
//
//        FoodDispencerRemote remoteForFoodDispencer = new FoodDispencerRemote(dispenceFoodCommand);
//
//
//        remoteForFoodDispencer.press();
    }
}
