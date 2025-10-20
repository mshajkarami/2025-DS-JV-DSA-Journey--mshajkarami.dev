package dev.mshajkarami.ds.jv.dsajourney;

import dev.mshajkarami.ds.jv.dsajourney.ArraysandVectors.FizzBuzz;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        VectorSTL.demoVector();
//        Vector2D.demoVector();
        System.out.println("Enter the n for fizzbuzz game: ");
        int n = input.nextInt();
        FizzBuzz.run(n);
    }
}