package IO.SpringBootStarter.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by harsh on 4/13/2017.
 */
@RestController
public class topicController {
    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topic")
    public List<Topic> GetAlltopics() {
        return topicservice.getAlltopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic geTopic(@PathVariable String id) {

        return topicservice.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic) {
        topicservice.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicservice.updateTopic(id,topic);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicservice.deleteTopic(id);
    }
}
