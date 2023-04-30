package devs.denoms.rcv.access;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.repos.ElectionsRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository("Fake")
public class FakeAccessService implements ElectionsRepo{
    private static final List<Election> DB = new ArrayList<>();
    private static final List<Vote> VTS = new ArrayList<>();

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
    
}
