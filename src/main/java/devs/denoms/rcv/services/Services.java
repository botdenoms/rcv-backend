package devs.denoms.rcv.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import devs.denoms.rcv.model.Election;
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

    public String createElection(Election election){
        return repo.addElection(election);
    }
    
    public List<Election>  getElections(){
        return repo.getElections();
    }

    public Optional<Election> getElection(String id){
        return repo.getElection(id);
    }

    public Boolean vote(Vote vote){
        return repo.addVote(vote);
    }
    
    public List<Vote> votes(){
        return repo.getVotes();
    }

    public List<Vote> votesOfElection(String id){
         return repo.getVotesOf(id);
    }

}
