package FunctionsAndObjects;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class Faktorial {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number");
    int x = input.nextInt();
    int y = f(x);
    System.out.println("The answer is ==>" + " " + y);

}

    public static int f(int i) {
        if (i <0 ) {
            System.out.println("Please, input positive number");
            return 0;
        }
        if (i == 1 || i==0) {
            return 1;
        } else {
            return i*f(i-1);
        }
    }
}
