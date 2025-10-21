package dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors;

import java.util.HashSet;
import java.util.Vector;

public class Pairs {
    public static void run(int[] arr , Integer sum) {
        // Firs method | O(n2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        // Second method | O(n(lgn))

        // Third method | O(n)
        HashSet<Integer> helper = new HashSet<>();
        helper.add(arr[0]);
        for (int item : arr) {
            int Supplement = sum - item;
            if (helper.contains(Supplement)) {
                System.out.println(item + " " + Supplement);
            }else {
                System.out.println(" ");
            }
        }
    }
}
