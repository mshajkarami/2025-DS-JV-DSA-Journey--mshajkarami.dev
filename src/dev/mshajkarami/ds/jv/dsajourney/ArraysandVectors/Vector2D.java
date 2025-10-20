package dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors;

import java.util.Arrays;
import java.util.Vector;

public class Vector2D {
    public static void demoVector() {
        Vector<Vector<Integer>> matrix = new Vector<>();
        int rows = 3;
        int cols = 4;
        for (int i = 0; i < rows; i++) {
            Vector<Integer> row = new Vector<>();
            for (int j = 0; j < cols; j++) {
                row.add(0);
            }
            matrix.add(row);
        }
        // set value
        matrix.get(1).set(2,99);
        // Print
//        for (Vector<Integer> row : matrix) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < matrix.size(); i++) {
            for (Integer number : matrix.get(i)) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }
}
