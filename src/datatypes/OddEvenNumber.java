package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int x = input.nextInt();
        if (x<0){
            System.out.println("Please, enter positive number");
        }
        if (x%2==0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }
}
