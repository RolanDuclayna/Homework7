import java.util.ArrayList;

public class CustomerDriver {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Jerry", "No restriction"));
        customers.add(new Customer("Jenna", "No restriction"));
        customers.add(new Customer("Paul", "Paleo"));
        customers.add(new Customer("Lisa", "Vegan"));
        customers.add(new Customer("Sander", "Nut allergy"));
        customers.add(new Customer("Elizabeth", "Paleo"));

        for (Customer c : customers) {
            c.createPlan();
        }

    }

}
