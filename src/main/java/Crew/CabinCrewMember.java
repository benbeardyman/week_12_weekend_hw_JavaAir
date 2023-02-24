package Crew;

public class CabinCrewMember extends CrewMember{

    public CabinCrewMember (String name, CrewRank rank){
        super(name, rank);
    }

    public String makesAnnouncement(){
        return "Enjoy your flight, hope no snakes escape...";
    }

}
