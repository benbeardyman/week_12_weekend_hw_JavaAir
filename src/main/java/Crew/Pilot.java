package Crew;

public class Pilot extends CrewMember{
    private String licenceNumber;

    public Pilot (String name, CrewRank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public String fliesPlane() {
        return "I can flyyyyyy";
    }
}
