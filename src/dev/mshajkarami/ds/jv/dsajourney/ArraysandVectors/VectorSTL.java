package dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors;

import java.util.Arrays;
import java.util.Vector;

public class VectorSTL {
    public static void demoVector() {

        // Demo vector
        Vector<Integer> arr = new Vector<>(Arrays.asList(1,2,10,12,15));
        // Pop_back
        arr.removeElement(2);
        // Push_back
        arr.add(16);
        System.out.println(arr);

        // Fill Constructor All elements of a fixed value
        Vector<Integer> arrConstructor = new Vector<>();
        for (int i = 0; i < 10; i++) {
            arrConstructor.add(7);
        }
        System.out.println(arrConstructor);

        // Fill Constructor for Visited
        Vector<Integer> visited = new Vector<>();
        for (int i = 0; i < 100; i++) {
            visited.add(0);
        }
        System.out.println(visited);
    }
}
