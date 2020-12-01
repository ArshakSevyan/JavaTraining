package FunctionsAndObjects.PersonsX;

/**
 * Created By Arshak on Sep, 2020
 */
public class PersonsAPI {
    public static void oldestPerson(Person[] persons) {
        int oldestAge = 0;
        /**
         for (int i = 0; i < persons.length; i++) {
         Person person = persons[i];
         if (person.getAge() > oldestAge) {
         oldestAge = person.getAge();
         nameOfOldestPerson = person.getName();
         }
         }*/

        String nameOfOldestPerson = " ";
        for (Person person : persons) {
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
                nameOfOldestPerson = person.getName();
            }

        }
       System.out.println("The oldest person is " + " " + nameOfOldestPerson);

    }

    public static void youngestPerson(Person[] persons) {
        int young = persons[0].getAge();
        String youngestName = " ";
        for (Person person : persons) {
            if (person.getAge() < young) {
                young = person.getAge();
                youngestName = person.getName();
            }
        }
        System.out.println("The youngest person is " + " " + youngestName);

    }

    public static void byCompany(Person[] persons, String companyName) {
        for (Person person : persons) {
            if (person.company.getName().equals(companyName)) {
                System.out.println(person);
            }
        }
    }


}

