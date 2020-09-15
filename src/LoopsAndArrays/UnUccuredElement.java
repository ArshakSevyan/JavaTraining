package LoopsAndArrays;

import java.util.Arrays;

/**
 * Created By Arshak on Sep, 2020
 */
public class UnUccuredElement {
    public static void main(String[] args) {
        int[] array001 = new int[3];
        for (int i = 0; i < array001.length; i++) {
            array001[i] = (int) ((Math.random() * 10));
        }
        System.out.println(Arrays.toString(array001));
        int[] array002 = new int[3];
        for (int i = 0; i < array002.length; i++) {
            array002[i] = (int) ((Math.random() * 10));
        }
        System.out.println(Arrays.toString(array002));


        for (int i : array001) {
            boolean x = false;
            for (int j : array002) {
                if (i == j) {
                    x=true;
                    break;

                }
                }if (!x){
                System.out.println(i);
            }
        }
    }
}