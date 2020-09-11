package LoopsAndArrays;

import java.util.Arrays;

/**
 * Created By Arshak on Sep, 2020
 */
public class AscendingAndDescendingOrder {
    public static void main(String[] args) {
        int[] array001 = new int[3];
        for (int i = 0; i < array001.length; i++) {
            array001[i] = (int) ((Math.random() * 10));

            }
        System.out.println("Ascending order is :");
        System.out.println(Arrays.toString(array001));
        System.out.println("Descending order is :");
        for ( int i=array001.length-1;i>=0;i--){
            System.out.print(array001[i]+ " ");

        }

    }


}
