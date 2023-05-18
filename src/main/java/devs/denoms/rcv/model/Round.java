package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

public class Round {
    public String id;
    public int round;
    public boolean done;
    public int inactiveVotes;
    public List<Tally> candidates;

    public Round(
            @JsonProperty("round") int round, 
            @JsonProperty("final") boolean done, 
            @JsonProperty("inactive") int inactiveVotes, 
            @JsonProperty("candidates") List<Tally> candidates) {
        this.id = UUID.randomUUID().toString();
        this.round = round;
        this.done = done;
        this.inactiveVotes = inactiveVotes;
        this.candidates = candidates;
    } 
}
