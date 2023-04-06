package org.example.HW10_2;
//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }

        return sum1 + sum2;
    }
    //    #1
    //        int sum1 = 0;
    //        int sum2 = 0;
    //
    //        for (int j : arr1) {
    //            sum1 += j;
    //        }
    //
    //        for (int j : arr2) {
    //            sum2 += j;
    //        }
    //        return sum1 + sum2;
    //# 2
    //    int sum = 0;
    //        for (int i = 0; i < arr1.length; i++) {
    //        sum += arr1[i] + arr2[i];
    //    }
    //        return sum;

}
