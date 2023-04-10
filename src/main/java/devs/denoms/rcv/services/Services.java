package devs.denoms.rcv.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.FeedBack;
import devs.denoms.rcv.model.Vote;

@Service
public class Services {
    
    public static List<Election>  getElections(){
        List<Election> db = new ArrayList<Election>();
        db.add(new Election("test 1", "2024-15-09", "test description"));
        db.add(new Election("test 2", "2026-15-09", "test description"));
        db.add(new Election("test 3", "2027-15-09", "test description"));
        return db;
    }

    public static Election getElection(String id){
        return new Election("test 1", "2024-15-09", "test description");
    }

    public static Vote vote(String id){
        return new Vote("test vote", 2);
    }

    public static FeedBack voteOnElection(String id){
        return new FeedBack(id);
    }

    public static List<Vote> getVotesOfElection(String id){
        List<Vote> db = new ArrayList<Vote>();
        db.add(new Vote("test 1", 1));
        db.add(new Vote("test 2", 2));
        db.add(new Vote("test 3", 5));
        return db;
    }

}
