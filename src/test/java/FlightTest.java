import Crew.CabinCrewMember;
import Crew.CrewRank;
import Crew.Pilot;
import Flight.Flight;
import Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Pilot coPilot;
    CabinCrewMember leadFlightAttendant;
    CabinCrewMember flightAttendant;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;


    @Before
    public void Flight(){
        flight = new Flight(121, "HNL", "LAX", 1425, 5, 2425.64);

        pilot = new Pilot("Sam McKeon", CrewRank.CAPTAIN, "AMEL08275307");
        coPilot = new Pilot("Rick", CrewRank.FIRST_OFFICER, "AMEL90986734");

        leadFlightAttendant = new CabinCrewMember("Grace", CrewRank.LEAD_ATTENDANT);
        flightAttendant = new CabinCrewMember("Claire Miller", CrewRank.FLIGHT_ATTENDANT);

        passenger1 = new Passenger("Neville Flynn", 1);
        passenger2 = new Passenger("Sean Jones", 0);
        passenger3 = new Passenger("Mercedes Harbont", 6);
        passenger4 = new Passenger("Clarence 'Three Gs' Dewey", 4);
        passenger5 = new Passenger("Troy", 2);
        passenger6 = new Passenger("Agent John Sanders", 1);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(121, flight.getFlightNumber());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals( "HNL", flight.getDepartureAirport());
    }

    @Test
    public void canGetDestinationAirport(){
        assertEquals( "LAX", flight.getDesitnationAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals( 1425, flight.getDepartureTime());
    }

    @Test
    public void canGetSeats(){
        assertEquals( 5, flight.getCapacity());
    }

    @Test
    public void canGetWeightAllowance(){
        assertEquals(2425.64 , flight.getWeightAllowance(), 0.1);
    }

    @Test
    public void canAddPilot(){
        flight.addPilot(pilot);
        assertEquals(1, flight.numberOfCrewOnPlane());
    }

    @Test
    public void canAddCrew(){
        flight.addCabinCrewMember(leadFlightAttendant);
        assertEquals(1, flight.numberOfCrewOnPlane());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.numberOfPassengersOnPlane());
    }

    @Test
    public void canCheckAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(3, flight.checkAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.numberOfPassengersOnPlane());
    }

}
