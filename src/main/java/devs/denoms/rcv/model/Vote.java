package devs.denoms.rcv.model;

public class Vote {
    public String election;
    public int choice;

    public Vote(String id, int choice){
        this.election = id;
        this.choice = choice;
    }
}
