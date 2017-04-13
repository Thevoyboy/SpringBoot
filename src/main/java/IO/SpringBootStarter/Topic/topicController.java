package IO.SpringBootStarter.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by harsh on 4/13/2017.
 */
@RestController
public class topicController {
    @RequestMapping("/topic")
    public List<Topic> Getalltopic(){
        return Arrays.asList(
                new Topic ("Spring","Springframework","Srping"),
                new Topic ("Sammu","Kothi","I Love YOU"),
                new Topic ("javascript","html","CSS")


        ) ;
    }
}
