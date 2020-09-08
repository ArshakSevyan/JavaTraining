package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class FahrenheitToCelsius {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degree in Fahrenheit");
        double x= input.nextInt();
        double y = (x-32)*5/9;
        System.out.println("Degree in Celsius is" + " " + y);
    }
}
