package ford.biwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	// server can be run within the api main folder running the command
	// from the maven cli $mvn spring-boot:run
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
