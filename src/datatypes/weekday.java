package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class weekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number");
        int x = input.nextInt();

            switch (x){
                case 1:
                    System.out.println("The day is Sunday ");
                    break;
                case 2:
                    System.out.println("The day is Monday ");
                    break;
                case 3:
                    System.out.println("The day is Tuesday ");
                    break;
                case 4:
                    System.out.println("The day is Wednesday ");
                    break;
                case 5:
                    System.out.println("The day is Thursday ");
                    break;
                case 6:
                    System.out.println("The day is Friday ");
                    break;
                case 7:
                    System.out.println("The day is Saturday ");
                    break;
                default:
                    System.out.println("Invalid input,Please, enter number which is between 1 and 7");



            }
        }

}

