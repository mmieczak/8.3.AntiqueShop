package transaction;

import data.Customer;
import data.Person;
import data.Product;

public class Receipt extends Transaction {
    private Person person;

    public Receipt(Product product, Customer customer) {
        super(product, customer);
        this.person = (Person) customer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
