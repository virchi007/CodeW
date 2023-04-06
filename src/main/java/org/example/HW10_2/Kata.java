package org.example.HW10_2;
//https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
public class Kata {

    public static boolean feast(String beast, String dish) {
        char firstLetterB = beast.charAt(0);
        char lastLetterB = beast.charAt(beast.length() - 1);
        char firstLetterD = dish.charAt(0);
        char lastLetterD = dish.charAt(dish.length() - 1);
        return firstLetterD == firstLetterB && lastLetterD == lastLetterB;

    }
//        return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);

}