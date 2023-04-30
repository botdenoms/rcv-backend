package devs.denoms.rcv.routes;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devs.denoms.rcv.model.Election;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.services.Services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("api/v1")
public class Routes {
    
    private final Services services; 

    @Autowired
    public Routes(Services services) {
        this.services = services;
    }
    
    @GetMapping("/elections")
    public ResponseEntity<List<Election>> elections(){
        return new ResponseEntity<>(services.getElections(), HttpStatus.OK);
    }

    @GetMapping("elections/{id}")
    public ResponseEntity<Optional<Election>> election(@PathVariable("id") String id){
        return new ResponseEntity<>(services.getElection(id), HttpStatus.OK);
    }

    @PostMapping("elections")
    public ResponseEntity<String> create(@RequestBody Election election){
        return new ResponseEntity<>(services.createElection(election), HttpStatus.OK);
    }

    @PostMapping("votes")
    public ResponseEntity<Boolean> vote(@RequestBody Vote vote){
        return new ResponseEntity<>(services.vote(vote), HttpStatus.OK);
    }

    @GetMapping("votes")
    public ResponseEntity<List<Vote>> votes(){
        return new ResponseEntity<>(services.votes(), HttpStatus.OK);
    }
    
    @GetMapping("votes/{id}")
    public ResponseEntity<List<Vote>> electionVotes(@PathVariable("id") String id){
        return new ResponseEntity<>(services.votesOfElection(id), HttpStatus.OK);
    }

}
