package FunctionsAndObjects;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the quantity of numbers which should be summed ");
        int x = input.nextInt();
        int elements[] = new int[x];
        System.out.println("Please enter the numbers");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextInt();
        }
        System.out.println("Sum of your inputs is " + " " + sum(elements));


    }
    public static int sum(int...x){
        int answer =0;
        for (int i : x){
            answer +=i;
        }return answer;
    }

}
