package Library;

/**
 * Created By Arshak on Dec, 2020
 */
public class Author {

    private String name_lastName;
    private String natonality;


    public Author(String name_lastName,String natonality){
        setName_lastName(name_lastName);
        setNatonality(natonality);
    }

    public String getName_lastName() {
        return name_lastName;
    }

    private void setName_lastName(String name_lastName) {
        this.name_lastName = name_lastName;
    }

    public String getNatonality() {
        return natonality;
    }

    private void setNatonality(String natonality) {
        this.natonality = natonality;
    }
    @Override
    public String toString(){
        return String.format("The author is %s,The author's nationality is %s",getName_lastName(),getNatonality());
    }
}
