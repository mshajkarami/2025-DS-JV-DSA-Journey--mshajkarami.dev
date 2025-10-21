package dev.mshajkarami.ds.jv.dsajourney;

import dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors.FizzBuzz;
import dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors.Pairs;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        VectorSTL.demoVector();
//        Vector2D.demoVector();
//        System.out.println("Enter the n for fizzbuzz game: ");
//        int n = input.nextInt();
//        FizzBuzz.run(n);
        System.out.println("Enter the array size of the array: ");
        int n = input.nextInt();
        System.out.println("Enter the array for pairs: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter a number for sum: ");
        int s = input.nextInt();
        Pairs.run(arr,s);
    }
}