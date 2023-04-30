package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Vote {
    public String election;
    public int[] choices;
    private final String voter;
    private final String id;
    
    public Vote(@JsonProperty("election") String election,
            @JsonProperty("voter") String voter,
            @JsonProperty("choices") int[] choices){
        this.election = election;
        this.choices = choices;
        this.voter = voter;
        this.id = UUID.randomUUID().toString();
    }

    public String voteOf(){
        return election;
    }

    public String voteId(){
        return id;
    }
    
    public String voterId(){
        return voter;
    }
}
