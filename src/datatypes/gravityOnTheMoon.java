package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class gravityOnTheMoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        double x = input.nextInt();
        double y = x*0.17;

        if (x<0){
            System.out.println("please,input positive digit");
        }
        else {
            System.out.println("Your weight on the moon will be " + " " + y + " kg");
        }

    }
}
