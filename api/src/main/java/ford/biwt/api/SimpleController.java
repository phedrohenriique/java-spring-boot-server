package ford.biwt.api;

// use imports from packages before initialize the class

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

// use decorator to specify controllers and routes
@RestController
@RequestMapping("/simple-controller")
public class SimpleController {

    // use decorator to specify method
    @GetMapping 
    public String simpleController(){
        return "server on";
    }
}