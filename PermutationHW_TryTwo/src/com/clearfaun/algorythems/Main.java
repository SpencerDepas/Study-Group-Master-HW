package com.clearfaun.algorythems;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Check permutation:
        //Given two strings, write a method to decide if one is a permutation of the
        //other

        //test cases
//        String wordOne = "olo";
//        String wordTwo = "loo";
//
//        String wordOne = "rrttyy";
//        String wordTwo = "yytrrt";

//        String wordOne = "qqqqqwwwwwww";
//        String wordTwo = "wqqqwwwqqwww";

        String wordOne = "butt";
        String wordTwo = "tbur";

        wordOne = wordOne.toLowerCase();
        wordTwo = wordTwo.toLowerCase();




        if(wordOne.length() == wordTwo.length()){

            int lengthOfWord = wordOne.length();
            int[] charOfWordOne = new int[wordOne.length()];
            int[] charOfWordTwo = new int[wordOne.length()];


            //put in array
            // 0(n)
            for(int i = 0 ; i < lengthOfWord; i ++){
                charOfWordTwo[i] = wordTwo.charAt(i);
                charOfWordOne[i] = wordOne.charAt(i);

//                System.out.println("charOfWordOne[i] : " + charOfWordOne[i]);
//                System.out.println("charOfWordTwo[i] : " + charOfWordTwo[i]);
//                System.out.println();
            }


            //sort
            // 0(n log n)
            Arrays.sort(charOfWordTwo);
            Arrays.sort(charOfWordOne);


            //compare
            // 0(n)
            for(int i = 0 ; i < lengthOfWord; i ++){

                if(charOfWordOne[i] != charOfWordTwo[i]){
                    System.out.println("Not a pemutation  " );
                    break;
                }else if(i == lengthOfWord-1){
                    //we get to the end and everything has been in the hashmap
                    System.out.println("Word is a permutation");
                }

            }


        }else{
            System.out.println("Word one is not a perumtation of Word two");
        }

    }
}
