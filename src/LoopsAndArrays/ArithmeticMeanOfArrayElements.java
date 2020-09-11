package LoopsAndArrays;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class ArithmeticMeanOfArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double arithmetic[] = new double[10];
        System.out.println("Please enter 10 elements");
        for (int i = 0; i < arithmetic.length; i++) {
            arithmetic[i] = input.nextInt();
        }
        double sum = 0;
        for (double v : arithmetic) {
            sum = sum + v;

        }
        System.out.println("The arithmetic mean of array elements is" + " " + sum);



    }
}
