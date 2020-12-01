package FunctionsAndObjects.PersonsX;

/**
 * Created By Arshak on Sep, 2020
 */
public class Person {
    private String name;
    private int age;
    Company company;

    public Person(String name, int age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


    }

    @Override
    public String toString() {
        return String.format("person name=%s,person age=%d,person company =%s", getName(), getAge(), company.toString());
    }
}
