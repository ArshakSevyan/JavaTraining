package FunctionsAndObjects.PersonsX;

/**
 * Created By Arshak on Sep, 2020
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return String.format("company name=%s", getName());
    }
}
