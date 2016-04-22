package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/21/16.
 */
public class FarmVendingMacheneAdapter implements FeedMachine{

    FarmVendingMachene farmVendingMachene;

    public FarmVendingMacheneAdapter(FarmVendingMachene farmVendingMachene){
        this.farmVendingMachene = farmVendingMachene;
    }

    @Override
    public void dispenseFood() {
        farmVendingMachene.dispenseCheese();
    }

    @Override
    public void dispenseWater() {
        farmVendingMachene.dispenseWine();
    }

    @Override
    public void throwAwayOldFood() {
        farmVendingMachene.takeOutTheGarbadge();
    }
}
