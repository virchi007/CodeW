package org.example.HW10_2;

public class PositionaOfAlphabet {
    public static String position(char alphabet) {
        alphabet = Character.toLowerCase(alphabet);
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
    //    String line = " abcdefghijklmnopqrstuvwxyz";
    //    return "Position of alphabet: " + line.indexOf(alphabet);
}
