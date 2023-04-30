package devs.denoms.rcv.repos;

import devs.denoms.rcv.model.Candidate;
import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.model.Voter;
import java.util.List;
import java.util.Optional;

public interface ElectionsRepo {
    List<Election> getElections();
    
    Optional<Election> getElection(String id);
    
    String addElection(Election election);
    
    Boolean addVote(Vote vote);
    
    List<Vote> getVotes();
    
    List<Vote> getVotesOf(String electionId);
    
    Boolean addCandidate(Candidate candidate);
    
    List<Candidate> getCandidates();
    
    List<Candidate> getCandidatesOf(String electionId);
    
    Boolean addVoter(Voter voter);
    
    List<Voter> getVoters();
    
    List<Voter> getVotersOf(String electionId);
}
