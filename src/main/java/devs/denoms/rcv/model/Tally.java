package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tally {
    public String name;
    public String party;
    public String profile;
    public String logo;
    public int votes;
    public double  percent;
    public int gains;
    public boolean eliminated;
    public boolean winner;

    public Tally(
            @JsonProperty("name") String name, 
            @JsonProperty("party") String party, 
            @JsonProperty("profile") String profile, 
            @JsonProperty("logo") String logo,
            @JsonProperty("votes") int votes, 
            @JsonProperty("percent") double percent, 
            @JsonProperty("gains") int gains, 
            @JsonProperty("eliminated") boolean eliminated, 
            @JsonProperty("winner") boolean winner) {
        this.name = name;
        this.party = party;
        this.profile = profile;
        this.logo = logo;
        this.votes = votes;
        this.percent = percent;
        this.gains = gains;
        this.eliminated = eliminated;
        this.winner = winner;
    }
}
