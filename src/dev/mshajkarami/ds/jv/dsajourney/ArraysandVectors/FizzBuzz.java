package dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors;

import java.util.Arrays;

public class FizzBuzz {
    public static void run(Integer number) {
        String [] arr = new String[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.toString(i+1) ;
        }
        for (int i = 2; i < arr.length; i+= 3 ){
            arr[i] = "fizz";
        }
        for (int i = 4; i < arr.length; i+= 5 ){
            arr[i] = "buzz";
        }
        for (int i = 14; i < arr.length; i+= 15 ){
            arr[i] = "fizzbuzz";
        }
        System.out.println(Arrays.toString(arr.clone()));
    }
}
