package com.clearfaun.algorythems;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[] randomArray;



    public static void main(String[] args) {
	// write your code here



        //creates a random array of size 20
        //int 0 - 99
        randomArray = randomArray ();

        TwoQueuePriorityQueue myPriorityQueue = new TwoQueuePriorityQueue(randomArray);
        //creates myPriorityQueue puts in the array
        //Big o (n)
        //this also prints the random array

        System.out.println();

        //removes the smallest int
        //it prints the smallest in and the new size of the queue
        myPriorityQueue.removeMin();
        System.out.println( );

        //Big o(n)
        myPriorityQueue.removeMin();

        //adds an element
        //Big o(1)
        myPriorityQueue.addElement(1);


        //prints the smallest element without removing it
        //Big o(1)
        myPriorityQueue.peekMin();



    }







    public static int[] randomArray (){
        //Construct the array we're using here
        int[] newArray = new int[20];

        for(int i = 0 ; i < newArray.length; i ++){


            newArray[i] = (int)(Math.random() * ( 100   ));
            System.out.println(newArray[i]);

           // System.out.println("some google example of quickSort");
        }
        System.out.println();
        return newArray;
    }
}
 class TwoQueuePriorityQueue {

    int[] randomArray;
    private int minNumber = 101;
    private int indexOfMinNumber = 0;


    Queue priortyQueueAllElements = new LinkedList<Integer>();
    Queue priortyQueueSmallestElement = new LinkedList<Integer>();


    public TwoQueuePriorityQueue(int[] array){

        for(int i = 0; i < array.length; i ++){

            if(array[i] < minNumber){

                minNumber = array[i];
                if( priortyQueueSmallestElement.size() ==1){
                    priortyQueueAllElements.add(Integer.parseInt(priortyQueueSmallestElement.peek() + ""));
                    priortyQueueSmallestElement.remove();
                }

                priortyQueueSmallestElement.add(array[i]);
            }else{
                priortyQueueAllElements.add(array[i]);
            }

        }

        System.out.println("starting min : " +  priortyQueueSmallestElement.peek());

    }

    public void addElement(int numberToAdd){


        if(numberToAdd < minNumber){
            System.out.println("currunt min : " +  numberToAdd);
            minNumber = numberToAdd;
            priortyQueueAllElements.add(Integer.parseInt(priortyQueueSmallestElement.peek() + ""));
            priortyQueueSmallestElement.remove();
            priortyQueueSmallestElement.add(minNumber);

        }else{
            priortyQueueAllElements.add(numberToAdd);
        }
    }

    public void peekMin(){
        System.out.println("Peek Min "+ priortyQueueSmallestElement.peek());
    }

    public void removeMin(){
        //System.out.println("removeing Min "+ priortyQueueSmallestElement.peek());

        priortyQueueSmallestElement.remove();

        //System.out.println("removeing Min "+ priortyQueueSmallestElement.peek());


        minNumber = 101;

        int pSize  = priortyQueueAllElements.size();
        //find new smallest int

        int count = 0 ;
        for(int i = 0; i < pSize; i ++){
            count++;

            //finding new min
            if(Integer.parseInt(priortyQueueAllElements.peek() + "") < minNumber){

                minNumber = Integer.parseInt(priortyQueueAllElements.peek() + "");

                //we then put it at the end of the queue so we do not delete it
                priortyQueueSmallestElement.add(minNumber);
                //remove the smallest from the queue
                priortyQueueAllElements.remove();
                if(priortyQueueSmallestElement.size() > 1){
                    priortyQueueAllElements.add(priortyQueueSmallestElement.peek());
                    priortyQueueSmallestElement.remove();
                }



            }else{
                //if number is not less than min
                //System.out.println("number is not less than min  --:  "  );
                int temp = Integer.parseInt(priortyQueueAllElements.peek() + "");
                priortyQueueAllElements.remove();
                priortyQueueAllElements.add(temp);
            }



        }

        //System.out.println("count  --:  " + count );
        System.out.println("Min after remove "+ priortyQueueSmallestElement.peek());
        System.out.println("priortyQueue size "+ priortyQueueAllElements.size());

        //System.out.println("priortyQueueSmallestElement size "+ priortyQueueSmallestElement.size());
    }
}

