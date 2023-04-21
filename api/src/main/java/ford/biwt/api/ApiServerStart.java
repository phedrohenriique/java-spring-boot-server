package ford.biwt.api;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiServerStart {
    
    // in Java , the Object type can be any kind of primary data type
    // Objects / Dictionaries are HashMap types

    @GetMapping
    public Object ServerStart(){
        Object serverResponse = new ServerResponse("server : on");
        return serverResponse;
    }

    class ServerResponse{
        HashMap<String, String> serverResponse = new HashMap<String, String>();

        public ServerResponse(String message){
            serverResponse.put("message", message);
        }
    
        public String getServerResponse(){
            System.out.println(this.serverResponse);
            return this.serverResponse.get("message");
        }
    }
}


