package devs.denoms.rcv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Voter {
    private final String name;
    private final String location;
    private final String id;

    public Voter() {
        this.name = null;
        this.location = null;
        this.id = UUID.randomUUID().toString();
    }
    
    public Voter( @JsonProperty("name") String name, 
            @JsonProperty("location") String location) {
        this.name = name;
        this.location = location;
        this.id = UUID.randomUUID().toString();
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.id;
    }
}
