package IO.SpringBootStarter.Topic;

/**
 * Created by harsh on 4/13/2017.
 */
public class Topic {
    private String id;
    private String name;
    private String destination;

    public Topic(){

    }
    public Topic(String id, String name, String destination) {
        super();
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
