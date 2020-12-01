package FunctionsAndObjects.PersonsX;

import java.util.Scanner;

/**
 * Created By Arshak on Sep, 2020
 */
public class PersonsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the company");
        String x = input.nextLine();
        PersonsAPI.byCompany(DataProv.persons,x);
        PersonsAPI.oldestPerson(DataProv.persons);
        PersonsAPI.youngestPerson(DataProv.persons);


    }
}
