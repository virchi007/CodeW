package org.example.HW10_1;
//https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
public class Correct {
    public static String correct(String string) {
        return string.replaceAll("5", "S")
        .replaceAll("0", "O")
        .replaceAll("1", "I");

    }
}
