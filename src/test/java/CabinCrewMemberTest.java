import Crew.CabinCrewMember;
import Crew.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Elaine Dickinson", CrewRank.LEAD_ATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Elaine Dickinson", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewRank.LEAD_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canMakeAnnouncment(){
        assertEquals("Enjoy your flight", cabinCrewMember.makesAnnouncement());
    }
}
