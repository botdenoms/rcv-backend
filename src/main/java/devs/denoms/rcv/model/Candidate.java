package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Candidate {
    private final String election;
    public String name;
    public String party;
    public String profile;
    public String logo;
    private final String id;

    public Candidate(@JsonProperty("election") String election, 
            @JsonProperty("name") String name, 
            @JsonProperty("party") String party, 
            @JsonProperty("profile") String profile, 
            @JsonProperty("logo") String logo) {
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
    
    public String getElection(){
        return election;
    }
}
