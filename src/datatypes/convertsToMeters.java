package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class convertsToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number in inches");
        double x = input.nextInt();
        double y = x*0.0254;
        System.out.println(x +" "+ "inch is"+" " +y +" "+ "meters");
    }
}
