package devs.denoms.rcv.repos;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.Vote;
import java.util.List;
import java.util.Optional;

public interface ElectionsRepo {
    List<Election> getElections();
    
    Optional<Election> getElection(String id);
    
    Election addElection(Election election);
    
    Vote addVote(Vote vote);
    
    List<Vote> getVotes();
    
    List<Vote> getVotesOf(String electionId);
}
