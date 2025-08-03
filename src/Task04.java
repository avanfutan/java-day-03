import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    private static List<Customer> loadCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Customer 1", "email1@abc.com"));
        customers.add(new Customer("Customer 2", null));
        customers.add(new Customer("Customer 3", "email3@abc.com"));
        customers.add(new Customer("Customer 4", null));
        customers.add(new Customer("Customer 5", "email5@abc.com"));
        return customers;
    }

    public static void run() {
        List<Customer> customers = loadCustomers();
        for (Customer customer : customers) {
            String email = customer.getEmail().map(String::toUpperCase).orElse("Email Not Provided");
            System.out.println("Customer: " + customer.getName() + ", Email: " + email);
        }
    }
}
