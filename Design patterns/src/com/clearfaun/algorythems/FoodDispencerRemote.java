package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/14/16.
 */
public class FoodDispencerRemote {
    Command theCommand;

    public FoodDispencerRemote(Command newCommand){
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }
}
