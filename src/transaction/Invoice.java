package transaction;

import data.Customer;
import data.Product;

public class Invoice extends Transaction {
    private Customer customer;


    public Invoice(Product product, Customer customer) {
        super(product, customer);
        this.customer = customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}