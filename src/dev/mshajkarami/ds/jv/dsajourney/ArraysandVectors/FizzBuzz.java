package dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors;

import java.util.Arrays;

public class FizzBuzz {
    public static void run(Integer number) {
        String [] arr = new String[number];
        // First method
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.toString(i+1) ;
//        }
//        for (int i = 2; i < arr.length; i+= 3 ){
//            arr[i] = "fizz";
//        }
//        for (int i = 4; i < arr.length; i+= 5 ){
//            arr[i] = "buzz";
//        }
//        for (int i = 14; i < arr.length; i+= 15 ){
//            arr[i] = "fizzbuzz";
//        }
        // Second method
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0)
                arr[i-1] = "fizzbuzz";
            else if (i % 3 == 0)
                arr[i-1] = "fizz";
            else if (i % 5 == 0)
                arr[i-1] = "buzz";
            else {
                arr[i-1] = String.valueOf(i);
            }
        }

        System.out.println(Arrays.toString(arr.clone()));
    }
}
