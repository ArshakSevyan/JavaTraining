package datatypes;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class coordinates {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter x1 point");

        double x1=input.nextInt();

        System.out.println("enter y1 point");

        double y1=input.nextInt();

        System.out.println("enter x2 point");

        double x2=input.nextInt();

        System.out.println("enter y2 point");

        double y2=input.nextInt();
        double dis;
        double mid1;
        double mid2;



        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        mid1 = Math.sqrt((x1 + x2) / 2);
        mid2= (y1 + y2) / 2;

        System.out.println("Distance between two cities is" +" "+dis);
        System.out.println("The midle oint is" + " " + mid1 + ";" +" "+ mid2);

    }

    }

