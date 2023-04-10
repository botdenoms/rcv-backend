package devs.denoms.rcv.model;

import java.util.ArrayList;
import java.util.List;

public class Election {
    public String name;
    public String description;
    public String date;
    public List<String> candidates = new ArrayList<String>();

    public Election(String name, String date, String description){
        this.name = name;
        this.description = description;
        this.date = date;
    }
}

