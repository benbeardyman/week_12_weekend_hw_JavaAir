package Crew;

public abstract class CrewMember {
    private String name;
    private CrewRank rank;

    public CrewMember (String name, CrewRank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public CrewRank getRank(){
        return this.rank;
    }

}
