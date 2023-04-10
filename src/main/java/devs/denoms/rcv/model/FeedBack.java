package devs.denoms.rcv.model;

public class FeedBack {
    public String election;
    public Boolean success;

    public FeedBack(String id){
        this.election = id;
        this.success = true;
    }
}
