package Passenger;

public class  Passenger {
    private String name;
    private int bags;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.bags;
    }
}
