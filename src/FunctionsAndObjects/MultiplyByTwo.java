package FunctionsAndObjects;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //let the client input the length of the array
        System.out.println("Please enter the lenght of array");
        int x = input.nextInt();
        int multiply[] = new int[x];
        //let the client input the elements of the array
        System.out.println("Please enter the elements");
        for (int i = 0; i < multiply.length; i++) {
            multiply[i] = input.nextInt();
        }
        //using method and print the answer
        byTwo(multiply);
        System.out.println(Arrays.toString(multiply));

    }
     static void byTwo(int [] x){
        for (int i=0;i<x.length;i++){
            x[i]*=2;
        }

    }


}
