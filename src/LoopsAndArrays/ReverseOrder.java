package LoopsAndArrays;

import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created By Arshak on Sep, 2020
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of array");
        int x = input.nextInt();
        int revers[] = new int[x];
        System.out.println("Please enter the elements");
        for (int i=0;i<revers.length;i++){
            revers[i]=input.nextInt();
        }
        System.out.println("Your inputs in revers order is :");
        for (int i=revers.length-1;i>=0;i--){
            System.out.print(revers[i]+ " ");
        }


    }
}
