package customers;

import attractions.Attraction;
import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Rollercoaster rollercoaster;
    Customer customerTall;
    Customer customerShort;

    @Before
    public void setUp()  {
        customerTall = new Customer(25, 190, 50);
        customerShort = new Customer(25, 149, 50);
        rollercoaster = new Rollercoaster(15.00, 150, "RollerCoaster", 3);
        }


    @Test
    public void canBuyTicket() {


    }
}