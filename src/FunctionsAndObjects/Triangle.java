package FunctionsAndObjects;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the first side ");
        double x = input.nextInt();
        System.out.println("Please, enter the second side ");
        double y = input.nextInt();
        System.out.println("Please, enter the third side ");
        double z = input.nextInt();
        if (x + y <= z || x + z <= y || z + y <= x) {
            System.out.println("Your input doesn't match to triangle standards");
        } else {
            System.out.println("The area of the resulting triangle is ==>" + " " + area(x,y,z));

        }



        }
    public static double area ( double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}

