package devs.denoms.rcv.model;

public class Voter {
    private final String name;
    private final String location;

    public Voter() {
        this.name = null;
        this.location = null;
    }
    
    public Voter(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public String getIdentity(){
        return this.name;
    }
}
