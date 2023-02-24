import Crew.CrewRank;
import Crew.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sam McKeon", CrewRank.CAPTAIN, "AMEL08275307");
    }

    @Test
    public void canGetName(){
        assertEquals("Sam McKeon", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("AMEL08275307", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I can flyyyyyy", pilot.fliesPlane());
    }


}
