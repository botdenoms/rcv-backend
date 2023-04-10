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
import devs.denoms.rcv.model.FeedBack;
import devs.denoms.rcv.model.Vote;
import devs.denoms.rcv.services.Services;

@RestController
@RequestMapping
public class Routes {
    
    @GetMapping("/")
	public ResponseEntity<String> home(){
        return new ResponseEntity<String>("Home page", HttpStatus.OK);
	}
    
    @GetMapping("api/v1/elections")
    public ResponseEntity<List<Election>> elections(){
        return new ResponseEntity<List<Election>>(Services.getElections(), HttpStatus.OK);
    }

    @GetMapping("api/v1/elections/{id}")
    public ResponseEntity<Election> election(@PathVariable("id") String id){
        return new ResponseEntity<Election>(Services.getElection(id), HttpStatus.OK);
    }

    @PostMapping("api/v1/elections/vote")
    public ResponseEntity<FeedBack> vote(@RequestBody String id){
        return new ResponseEntity<FeedBack>(Services.voteOnElection(id), HttpStatus.OK);
    }

    @GetMapping("api/v1/elections/vote/{id}")
    public ResponseEntity<Vote> electionVote(@PathVariable("id") String id){
        return new ResponseEntity<Vote>(Services.vote(id), HttpStatus.OK);
    }

    @GetMapping("api/v1/elections/votes/{id}")
    public ResponseEntity<List<Vote>> electionVotes(@PathVariable("id") String id){
        return new ResponseEntity<List<Vote>>(Services.getVotesOfElection(id), HttpStatus.OK);
    }

}
