package FunctionsAndObjects;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class TwoArrays {
    public static void main(String[] args) {
        int[] twoArraysInOne = newArray();
        System.out.println("New Array is" + " "+ Arrays.toString(twoArraysInOne));
        arithmeticMean(twoArraysInOne);

    }
// Create function which will take inputs, from user, for two Arrays and will unite them to one
    public static int[] newArray() {
        // Taking inputs from user for first and second Arrays
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of the firs array");
        int x = input.nextInt();
        int firstArray[] = new int[x];
        System.out.println("Please enter the lenght of the firs array");
        int y = input.nextInt();
        int secondArray[] = new int[y];
        System.out.println("Please enter the elements for the first Arrray");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = input.nextInt();

        }
        System.out.println("Please enter the elements for the second Arrray");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = input.nextInt();

        }
        //Creating third Array which combains elements of two Arrays
        int[]c = new int[firstArray.length+secondArray.length];
        System.arraycopy(firstArray,0,c,0,firstArray.length);
        System.arraycopy(secondArray,0,c,firstArray.length,secondArray.length);
        return c;

    }
    public static void arithmeticMean(int[]z){
        double sum =0;
        for (int value : z) {
            sum += value;
        }
        System.out.println("Arithmetic mean is" + " "+ sum/z.length);
    }

}
