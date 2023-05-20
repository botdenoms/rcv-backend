package devs.denoms.rcv.routes;

import devs.denoms.rcv.model.Candidate;
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
import devs.denoms.rcv.model.Result;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.model.Voter;
import devs.denoms.rcv.services.Services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("api/v1")
@CrossOrigin()
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

    @GetMapping("/elections/{id}")
    public ResponseEntity<Optional<Election>> election(@PathVariable("id") String id){
        return new ResponseEntity<>(services.getElection(id), HttpStatus.OK);
    }

    @PostMapping("/elections")
    public ResponseEntity<String> create(@RequestBody Election election){
        return new ResponseEntity<>(services.createElection(election), HttpStatus.OK);
    }

    @PostMapping("/votes")
    public ResponseEntity<Boolean> vote(@RequestBody Vote vote){
        return new ResponseEntity<>(services.vote(vote), HttpStatus.OK);
    }

    @GetMapping("/votes")
    public ResponseEntity<List<Vote>> votes(){
        return new ResponseEntity<>(services.votes(), HttpStatus.OK);
    }
    
    @GetMapping("/votes/{id}")
    public ResponseEntity<List<Vote>> votesOfElection(@PathVariable("id") String id){
        return new ResponseEntity<>(services.votesOfElection(id), HttpStatus.OK);
    }
    
    @PostMapping("/candidates")
    public ResponseEntity<Boolean> candidate(@RequestBody Candidate candidate){
        return new ResponseEntity<>(services.candidate(candidate), HttpStatus.OK);
    }
    
    @GetMapping("/candidates")
    public ResponseEntity<List<Candidate>> candidates(){
        return new ResponseEntity<>(services.candidates(), HttpStatus.OK);
    }
    
    @GetMapping("/candidates/{id}")
    public ResponseEntity<List<Candidate>> candidatesOfElection(@PathVariable("id") String id){
        return new ResponseEntity<>(services.candidatesOfElection(id), HttpStatus.OK);
    }
    
    @PostMapping("/voters")
    public ResponseEntity<Boolean> voter(@RequestBody Voter voter){
       return new ResponseEntity<>(services.voter(voter), HttpStatus.OK);
    }
    
    @GetMapping("/voters")
    public ResponseEntity<List<Voter>> voters(){
       return new ResponseEntity<>(services.voters(), HttpStatus.OK);
    }
    
    @GetMapping("/voters/{id}")
    public ResponseEntity<List<Voter>> votersOfElection(@PathVariable("id") String id){
       return new ResponseEntity<>(services.votersOfElection(id), HttpStatus.OK);
    }
    
    @GetMapping("/results")
    public ResponseEntity<List<Result>> results(){
       return new ResponseEntity<>(services.results(), HttpStatus.OK);
    }
    
    @GetMapping("/results/{id}")
    public ResponseEntity<Optional<Result>> resultsOfElection(@PathVariable("id") String id){
       return new ResponseEntity<>(services.resultsOfElection(id), HttpStatus.OK);
    }
    
    @PostMapping("/results")
    public ResponseEntity<Boolean> result(@RequestBody Result result){
       return new ResponseEntity<>(services.result(result), HttpStatus.OK);
    }
}
