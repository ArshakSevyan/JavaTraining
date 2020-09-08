package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class TheGreatestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double x = input.nextDouble();
        System.out.println("Enter the second number:");
        double y = input.nextDouble();
        System.out.println("Enter the third number:");
        double z = input.nextDouble();

        if (x > y & x > z) {
            System.out.println("The greatest number" + " " + x);
        }
        if (x > y & x < z) {
            System.out.println("The greatest number" + " " + z);
        }
        if (x < y & x > z) {
            System.out.println("The greatest number" + " " + y);

        }
        if (x > y & x == z) {
            System.out.println("The greatest number" + " " + x);

        }
        if (x == y & x > z) {
            System.out.println("The greatest number" + " " + x);
        }
        if (x < y & y == z) {
            System.out.println("The greatest number" + " " + y);
        }
        if (x == y & y == z) {
            System.out.println("The greatest number" + " " + x);
        }
    }
}
