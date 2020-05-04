package transaction;

import data.Customer;
import data.Product;

public class Transaction {

    private Product product;
    private Customer customer;

    public Transaction(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}



