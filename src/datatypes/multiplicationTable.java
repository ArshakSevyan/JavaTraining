package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number:");
        int x = input.nextInt();
        for (int y = 1; y <= 9; y++) {
            int tableResult = x * y;
            System.out.println(x + "*" + y + "=" + tableResult);
        }
    }
}
