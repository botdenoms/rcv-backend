package devs.denoms.rcv.model;

public class Candidate {
    public String name;
    public String party;
    public String profile;
    public String logo;

    public Candidate(String name, String party, String profile, String logo) {
        this.name = name;
        this.party = party;
        this.logo = logo;
        this.profile = profile;
    } 
}
