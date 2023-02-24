package Crew;

public class Pilot extends CrewMember{
    private String licenceNumber;

    public Pilot(String name, CrewRank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }
}
