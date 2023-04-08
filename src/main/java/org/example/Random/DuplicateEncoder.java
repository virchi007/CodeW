package org.example.Random;

public class DuplicateEncoder {
    public static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)))
                result += "(";
            else result += ")";

        }
        return result;
    }
}
