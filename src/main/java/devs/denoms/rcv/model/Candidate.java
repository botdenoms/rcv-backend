package devs.denoms.rcv.model;

import java.util.UUID;

public class Candidate {
    public String election;
    public String name;
    public String party;
    public String profile;
    public String logo;
    private final String id;

    public Candidate(String election, String name, String party, String profile, String logo) {
        this.election = election;
        this.name = name;
        this.party = party;
        this.logo = logo;
        this.profile = profile;
        this.id = UUID.randomUUID().toString();
    } 
    
    public String getId(){
        return id;
    }
}
