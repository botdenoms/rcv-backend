package devs.denoms.rcv.access;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.repos.ElectionsRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository("Fake")
public class FakeAccessService implements ElectionsRepo{
    private static final List<Election> DB = new ArrayList<>();

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
    public Election addElection(Election election) {
        DB.add(election);
        return election;
    }
    
}
