package FunctionsAndObjects;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class Fibonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int x = input.nextInt();
        int y = n(x);
        System.out.println("The answer is ==>" + " " + y);

    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i==2) {
            return 1;
        } else {
            return n(i - 1) + n(i - 2);
        }
    }
}
