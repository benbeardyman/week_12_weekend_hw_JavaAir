import Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Dr. Rumack", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Dr. Rumack", passenger.getName());
    }

    @Test
    public void canCountNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
