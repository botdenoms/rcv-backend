package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Election {
    public String id;
    public String name;
    public String description;
    public String date;
    public List<Candidate> candidates = new ArrayList<>();

    public Election(
            @JsonProperty("name") String name,
            @JsonProperty("date") String date, 
            @JsonProperty("descript") String description
        ){
        this.name = name;
        this.description = description;
        this.date = date;
        this.id = UUID.randomUUID().toString();
    }

    public String electionId(){
        return id;
    }
    
    public void addCandidate(Candidate contender){
        candidates.add(contender);
    }
    
    public List<Candidate> candidatesPresent(){
        return candidates;
    }
}

