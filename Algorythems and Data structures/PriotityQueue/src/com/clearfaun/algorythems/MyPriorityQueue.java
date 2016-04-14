package com.clearfaun.algorythems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SpencerDepas on 4/13/16.
 */
public class MyPriorityQueue {

    int[] randomArray;
    private int minNumber = 99;
    private int indexOfMinNumber = 0;

    List<Integer> priortyQueue = new ArrayList<>();


    public MyPriorityQueue(int[] array){
        randomArray = array;
        for(int i = 0; i < array.length; i ++){
            priortyQueue.add(i,array[i]);
            if(priortyQueue.get(i) < minNumber){
                System.out.println("currunt min : " +  priortyQueue.get(i));
                minNumber = priortyQueue.get(i);
                indexOfMinNumber = i;
            }
            System.out.println(priortyQueue.get(i));
        }

    }

    public void addElement(int numberToAdd){

        priortyQueue.add(priortyQueue.size()  , numberToAdd);
        //System.out.println("priortyQueue.get at last index : " +  priortyQueue.get(priortyQueue.size() -1) );
        if(numberToAdd < minNumber){
            indexOfMinNumber = priortyQueue.size() -1  ;
            minNumber = numberToAdd;
            System.out.println("currunt min : " +  numberToAdd);
        }
    }

    public void peekMin(){
        System.out.println("Peek Min "+ priortyQueue.get(indexOfMinNumber));
    }

    public void removeMin(){

        priortyQueue.remove(indexOfMinNumber);

    }
}
