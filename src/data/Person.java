package data;

public class Person extends Customer{
    private final String surname;

    public Person(String name, String surname, boolean isPremium){
        super(name,isPremium);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
