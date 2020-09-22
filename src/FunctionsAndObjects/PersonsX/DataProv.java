package FunctionsAndObjects.PersonsX;

/**
 * Created By Arshak on Sep, 2020
 */
public class DataProv {
    static Person[] persons= new Person[8];
    static Company juventus = new Company("Juventus");
    static Company barca = new Company("Barcelona");
    static Company liverpool = new Company("Liverpool");
    static Company roma = new Company("Real Madrid");

    static {
        persons[0]=new Person("Alessandro Del Piero",41,juventus);
        persons[1]=new Person("Pavel Nedved",43,juventus);
        persons[2]=new Person("Ronaldinho",40,barca);
        persons[3]=new Person("Carles Puyol",43,barca);
        persons[4]=new Person("Stiven Gerrard",40,liverpool);
        persons[5]=new Person("Allison",27,liverpool);
        persons[6]=new Person("Francesco Totti",41,roma);
        persons[7]=new Person("Danielle De Rossi",40,roma);



    }
}
