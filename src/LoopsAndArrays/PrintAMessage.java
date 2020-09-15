package LoopsAndArrays;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class PrintAMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the message");
        String message = input.next();
        System.out.println("Please enter the number");
        int x = input.nextInt();
        int array001[] = new int[x];
        if (x<=0){
            System.out.println("Please,input positive number");
        }
        else {
            for (int value : array001) {
                System.out.println(value + message);


            }

        }
        }





    }

