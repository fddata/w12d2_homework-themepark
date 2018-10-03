package attractions;

import customers.Customer;

import java.util.ArrayList;

public abstract class Attraction {

    private double takings;
    private double price;
    private int minHeight;
    private String name;
    private ArrayList<Customer> customers;

    public Attraction(double price, int minHeight, String name) {
        this.takings = takings;
        this.price = price;
        this.minHeight = minHeight;
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int getNumberOfCustomers(){
        return customers.size();
    }

    public void sellTicketToCustomer(Customer customer){

    }


}
