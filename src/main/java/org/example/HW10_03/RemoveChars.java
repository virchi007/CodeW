package org.example.HW10_03;

//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
public class RemoveChars {
    public static String remove(String str) {

        return str.substring(1, str.length() - 1);
    }
    //       return str.replaceAll("^.|.$", "");
}
