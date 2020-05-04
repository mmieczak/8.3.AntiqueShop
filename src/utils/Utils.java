package utils;

import data.Company;
import data.Customer;
import data.Person;
import data.Product;
import transaction.Invoice;
import transaction.Receipt;
import transaction.Transaction;

public class Utils {

    public Transaction registerTransaction(Customer customer, Product product) {
        Transaction transaction = null;
        if (customer instanceof Person) {
            transaction = new Receipt(product, customer);
        } else if (customer instanceof Company) {
            transaction = new Invoice(product, customer);
        }
        return transaction;
    }

    public void ShowDetails(Transaction transaction) {
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>> \n" +
                "Product details: \n " +
                "\t Name: " + transaction.getProduct().getName() + "\n" +
                "\t Description: " + transaction.getProduct().getDescription() + "\n" +
                "Billing details: \n" +
                "\t Type: " + transaction.getCustomer().getClass().getSimpleName() + "\n" +
                "\t Price: " + transaction.getProduct().getPrice() + "\n");
        if (transaction.getCustomer().getClass() == Company.class) {
            System.out.print("\t Buyer: " + transaction.getCustomer().getName() + "\n" +
                    "\t VAT: " + ((Company) (transaction).getCustomer()).getVatNumber() + "\n");
        }
        else if(transaction.getCustomer().getClass() == Person.class){
            System.out.print("\t Buyer: " + transaction.getCustomer().getName() + " " +
                     ((Person)transaction.getCustomer()).getSurname() + "\n");
        }

        if (transaction.getCustomer().isPremium()) {
            double newPrice = transaction.getProduct().getPrice() - transaction.getProduct().getPrice() * Customer.DISCOUNT_FACTOR;
            System.out.print("PREMIUM CUSTOMER SECTION \n" +
                    "\t New price: " + newPrice + "\n");
        }

    }
}