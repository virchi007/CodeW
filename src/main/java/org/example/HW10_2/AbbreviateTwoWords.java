package org.example.HW10_2;

public class AbbreviateTwoWords {
//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    public static String abbrevName(String name) {
        String[] arr = name.toUpperCase().split(" ");
        return arr[0].charAt(0)+"."+arr[1].charAt(0);
    }
    //    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    //    return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();

}
