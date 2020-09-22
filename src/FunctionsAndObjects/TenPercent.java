package FunctionsAndObjects;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class TenPercent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of the array");
        int x = input.nextInt();
        int arrayX[] = new int[x];
        System.out.println("Please enter the elements for the first Arrray");
        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i] = input.nextInt();
        }
        System.out.println("Please enter position of element, for which you want to calculate the percentage ");
        int c = input.nextInt();
        System.out.println("Ten percent is" + " "+ calculatePercent(arrayX,c));

    }

    public static double calculatePercent(int[]z,int y){
        double answer = z[y]*10/100;
        return answer;
    }
}
