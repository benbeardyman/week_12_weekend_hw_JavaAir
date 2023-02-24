import Crew.CabinCrewMember;
import Crew.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember flightAttendant;

    @Before
    public void before(){
        flightAttendant = new CabinCrewMember("Claire Miller", CrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Claire Miller", flightAttendant.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewRank.FLIGHT_ATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canMakeAnnouncment(){
        assertEquals("Enjoy your flight, hope no snakes escape...", flightAttendant.makesAnnouncement());
    }
}
