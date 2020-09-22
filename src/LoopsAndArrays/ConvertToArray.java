package LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class ConvertToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int x = input.nextInt();
        String number = Integer.toString(x);
        int[]convert = new int[number.length()];
        for (int i=number.length()-1;i>=0;i--){
            convert[i]=x%10;
            x/=10;
        }
        System.out.println(Arrays.toString(convert));
    }
}
