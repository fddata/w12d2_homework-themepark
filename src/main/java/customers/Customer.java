package customers;

import attractions.Attraction;

public class Customer {

    private int age;
    private int height;
    private double money;

    public Customer(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void buyTicket(Attraction attraction) {
        if (this.height >= attraction.getMinHeight()) {
            this.money -= attraction.getPrice();
        }
    }
}
