package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class CalculatorVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = input.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = input.nextDouble();
        System.out.println("Enter the action:");
        char action = input.next().charAt(0);
        String z= "The answer is";

        switch (action) {
            case '+':
                System.out.println(z +" " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println(z +" " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println(z + " " +(firstNumber * secondNumber));
                break;
            case '/': {
                if (secondNumber == 0) {
                    System.out.println("The number cannot be divided on 0 ");
                } else {
                    System.out.println(z + " " +(firstNumber / secondNumber));
                }
                break;
            }
            default:
                System.out.println("Invalid input!");
        }
    }
}
