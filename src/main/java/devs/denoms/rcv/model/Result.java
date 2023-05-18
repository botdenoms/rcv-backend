package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Result {
    public String id;
    public String election;
    public int votesCount;
    public int roundsCount;
    public Map<String, String> winner;
    public List<Round> rounds;

    public Result(
            @JsonProperty("election") String election, 
            @JsonProperty("votes") int votesCount, 
            @JsonProperty("roundsCount") int roundsCount, 
            @JsonProperty("winner") Map<String, String> winner, 
            @JsonProperty("rounds") List<Round> rounds) {
        this.id = UUID.randomUUID().toString();
        this.election = election;
        this.votesCount = votesCount;
        this.roundsCount = roundsCount;
        this.winner = winner;
        this.rounds = rounds;
    }
    
    public String getElection(){
        return election;
    }
    
}
