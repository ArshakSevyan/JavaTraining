package LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class ExactlyKTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter k number");
        int x = input.nextInt();
        int[] array001 = new int[10];
        for (int i = 0; i < array001.length; i++) {
            array001[i] = (int) ((Math.random() * 10));
        }
        System.out.println(Arrays.toString(array001));
        boolean noMatching = true;

        for (int i = 0; i < array001.length; i++) {
            int y = 1;
            for (int j = i + 1; j < array001.length; j++) {
                if (array001[i] == array001[j]) {
                    y = y + 1;
                }
            }
            if (y == x) {
                noMatching=false;
                System.out.println(array001[i]);
                break;
            }
        }

        if (noMatching){
            System.out.println("No matching");
        }


    }
}
