import data.Company;
import data.Customer;
import data.Person;
import data.Product;
import transaction.Transaction;
import utils.Utils;

public class Tester {

    public static void main(String[] args) {

        Utils utilities = new Utils();

        //Container for antiques
        Product[] antiques = new Product[10];

        //Register antiques
        antiques[0] = new Product("Antyk1", "Great look", 10000, 2);
        antiques[1] = new Product("Antyk2", "Missing parts", 2000, 3);
        antiques[2] = new Product("Antyk3", "Very rare", 30000, 1);

        //Register Customers
        Customer[] customers = new Customer[10];
        customers[0] = new Company("Tesla", true, "DE666111999");
        customers[1] = new Company("KGHM", false, "PL0123456789");
        customers[2] = new Person("Tom", "Cruise", true);
        customers[3] = new Person("Kinga", "Rusin", false);
        customers[4] = new Company("Lotos", true, "PL9876543210");

        //Simulate registration of 4 transactions
        Transaction[] transactions = new Transaction[4];
        transactions[0] = utilities.registerTransaction(customers[0], antiques[0]); //PREMIUM & Company
        transactions[1] = utilities.registerTransaction(customers[1], antiques[1]); //Non PREMIUM & COmpany
        transactions[2] = utilities.registerTransaction(customers[2], antiques[2]); //PREMIUM & Person
        transactions[3] = utilities.registerTransaction(customers[3], antiques[0]); //Non PREMIUM & Person

        //Display transactions
        for (Transaction transaction : transactions) {
            utilities.ShowDetails(transaction);
        }

    }
}
