package Flight;

import Crew.CabinCrewMember;
import Crew.Pilot;
import Passenger.Passenger;

import java.util.ArrayList;

public class Flight {
    private int flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private int departureTime;
    private int capacity;
    private Double weightAllowance;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;

    public Flight (int flightNumber, String departureAirport, String destinationAirport, int departureTime, int capacity, Double weightAllowance){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.weightAllowance = weightAllowance;
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDesitnationAirport() {
        return this.destinationAirport;
    }

    public int getDepartureTime() {
        return this.departureTime;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getWeightAllowance() {
        return this.weightAllowance;
    }

    public int numberOfCrewOnPlane() {
        int pilots = this.pilots.size();
        int crew = this.cabinCrew.size();
        return pilots + crew;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public int numberOfPassengersOnPlane(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int checkAvailableSeats() {
        return getCapacity() - numberOfPassengersOnPlane();
    }

    public void bookPassenger(Passenger passenger) {
        if (checkAvailableSeats() > 0);
            addPassenger(passenger);
    }
}
