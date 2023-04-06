package org.example.HW10_1;
//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
public class Sequence {

    public static int[] reverse(int n){

        int [] array = new int [n];
        for (int i = n -1; i >= 0; i--) {
          array [i] = n-i;
        }
        return array;
    }


//    int [] array = new int [n];
//        for (int i = 0; i < 0; i++) {
//        array [i] = n-i;
//    }
//        return array;

}
