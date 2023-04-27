package devs.denoms.rcv.repos;

import devs.denoms.rcv.model.Election;
import java.util.List;
import java.util.Optional;

public interface ElectionsRepo {
    List<Election> getElections();
    
    Optional<Election> getElection(String id);
    
    Election addElection(Election election);
}
