package IO.SpringBootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harsh on 4/13/2017.
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String sayhi(){
        return "Sammu";
    }
}
