import Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Neville Flynn", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Neville Flynn", passenger.getName());
    }

    @Test
    public void canCountNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
