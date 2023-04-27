package devs.denoms.rcv.model;

import java.util.UUID;

public class Vote {
    public String election;
    public int choice;
    private Voter voter;
    private final String id;
    
    public Vote(String election, int choice){
        this.election = election;
        this.choice = choice;
        this.id = UUID.randomUUID().toString();
    }

    public String voteOf(){
        return election;
    }

    public String voteId(){
        return id;
    }
    
    public Voter getCaster(){
        return voter;
    }
}
