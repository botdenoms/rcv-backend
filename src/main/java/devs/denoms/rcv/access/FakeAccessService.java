package devs.denoms.rcv.access;

import devs.denoms.rcv.model.Candidate;
import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.Result;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.model.Voter;
import devs.denoms.rcv.repos.ElectionsRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository("Fake")
public class FakeAccessService implements ElectionsRepo{
    private static final List<Election> DB = new ArrayList<>();
    private static final List<Vote> VTS = new ArrayList<>();
    private static final List<Voter> VTRS = new ArrayList<>();
    private static final List<Candidate> CDS = new ArrayList<>();
    private static final List<Result> RTS = new ArrayList<>();

    @Override
    public List<Election> getElections() {
        return DB;
    }

    @Override
    public Optional<Election> getElection(String id) {
        for (Election election : DB) {
            if(election.electionId().equals(id)){
                return Optional.of(election);
            }
        }
        return Optional.empty();
    }

    @Override
    public String addElection(Election election) {
        DB.add(election);
        return election.electionId();
    }

    @Override
    public Boolean addVote(Vote vote) {
        VTS.add(vote);
        return true;
    }

    @Override
    public List<Vote> getVotes() {
        return VTS;
    }

    @Override
    public List<Vote> getVotesOf(String electionId) {
        List<Vote> tmp = new ArrayList<>();
        for (Vote vote : VTS) {
            if (vote.voteOf().equals(electionId)) {
                tmp.add(vote);
            }
        }
        return tmp;
    }

    @Override
    public Boolean addCandidate(Candidate candidate) {
        CDS.add(candidate);
        return true;
    }

    @Override
    public List<Candidate> getCandidates() { 
        return CDS;
    }

    @Override
    public List<Candidate> getCandidatesOf(String electionId) {
        List<Candidate> tmp = new ArrayList<>();
        for (Candidate cd : CDS) {
            if (cd.getElection().equals(electionId)) {
                tmp.add(cd);
            }
        }
        return tmp;
    }

    @Override
    public Boolean addVoter(Voter voter) {
        VTRS.add(voter);
        return true;
    }

    @Override
    public List<Voter> getVoters() {
        return VTRS;
    }

    @Override
    public List<Voter> getVotersOf(String electionId) {
        List<Voter> tmp = new ArrayList<>();
        List<Vote> votesOf = getVotesOf(electionId);
        for(Voter vtr: VTRS){
            for (Vote vt : votesOf){
                if(vtr.getId().equals(vt.voterId())){
                    tmp.add(vtr);
                }
            }
        }
        return tmp;
    }

    @Override
    public Boolean addResult(Result result) {
        RTS.add(result);
        return true;
    }

    @Override
    public List<Result> getResults() {
        return RTS;
    }

    @Override
    public Optional<Result> getResult(String id) {
        for (Result res : RTS) {
            if (res.getElection().equals(id)) {
                return Optional.of(res);
            }
        }
        return Optional.empty();
    }
    
}
