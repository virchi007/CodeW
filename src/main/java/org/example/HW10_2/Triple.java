package org.example.HW10_2;
//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
public class Triple {
    public static String tripleTrouble(String one, String two, String three) {
        String newString = "";
        for (int i = 0; i < one.length(); i++) {
            newString += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return newString;
    }

    //    StringBuilder builder = new StringBuilder();
    //    for (int i = 0; i < one.length(); i++) {
    //      builder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
    //    }
    //    return builder.toString();
}
