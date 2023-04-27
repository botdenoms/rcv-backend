package devs.denoms.rcv.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.FeedBack;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.repos.ElectionsRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class Services {
    private final ElectionsRepo repo;
    
    @Autowired
    public Services(@Qualifier("Fake") ElectionsRepo repo){
        this.repo = repo;
    }

    public Election createElection(Election election){
        return repo.addElection(election);
    }
    
    public List<Election>  getElections(){
        return repo.getElections();
    }

    public Optional<Election> getElection(String id){
        return repo.getElection(id);
    }

    public static Vote vote(String id){
        return new Vote("", 0);
    }

    public static FeedBack voteOnElection(String id){
        return new FeedBack(id);
    }

    public static List<Vote> getVotesOfElection(String id){
         List<Vote> db = new ArrayList<>();
         db.add(new Vote("test 1", 1));
         db.add(new Vote("test 2", 2));
         db.add(new Vote("test 3", 5));
        return db;
    }

}
