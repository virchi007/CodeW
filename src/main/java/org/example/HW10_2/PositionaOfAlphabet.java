package org.example.HW10_2;
//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
public class PositionaOfAlphabet {
    public static String position(char alphabet) {
        alphabet = Character.toLowerCase(alphabet);
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
    //    String line = " abcdefghijklmnopqrstuvwxyz";
    //    return "Position of alphabet: " + line.indexOf(alphabet);
}
