package ford.biwt.api.controllers;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class ControllerRegister {
    
    @PostMapping
    public void Register(@RequestBody JSONParser json){
        System.out.println(json);

    }
}
