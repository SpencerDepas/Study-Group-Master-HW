package com.clearfaun.algorythems;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //we have a few thousand of these in the farm
        //they feed all of our animals
        AnimalFeederMachene animalFeederMachene1_2334 = new AnimalFeederMachene();

        //let me show you how they work
        animalFeederMachene1_2334.dispenseFood();
        //Disensing food for our animals
        animalFeederMachene1_2334.dispenseWater();
        //Disensing water for our animals
        animalFeederMachene1_2334.throwAwayOldFood();
        //Throwing away the old food that the animals did not eat



        FarmVendingMachene farmVendingMachene = new FarmVendingMachene();

        //we have started doing tours on the farm
        //people wanted to buy our wine and cheese
        //so we created this vending machene
        farmVendingMachene.takeOutTheGarbadge();
        //throwing away garbage of farm visitors
        farmVendingMachene.dispenseCheese();
        //Disensing cheese for our farm visitors
        farmVendingMachene.dispenseWine();
        //Disensing wine for our farm visitors

        //this worked great
        //but our farmer was getting confused with have all these difrent controlls
        //since he was an expert in the old machene we made an adaper for him
        FeedMachine farmVendingMacheneWithAdapter = new FarmVendingMacheneAdapter(farmVendingMachene);

        farmVendingMacheneWithAdapter.throwAwayOldFood();
        //Throwing away garbage of farm visitors
        farmVendingMacheneWithAdapter.dispenseWater();
        //Disensing wine for our farm visitors
        farmVendingMacheneWithAdapter.dispenseFood();
        //Disensing cheese for our farm visitors



    }
}
