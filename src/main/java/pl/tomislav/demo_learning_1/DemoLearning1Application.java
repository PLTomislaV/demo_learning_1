package pl.tomislav.demo_learning_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoLearning1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoLearning1Application.class, args);
	}

	@GetMapping
	public String preliminary(){
		return ("This is a test site created as a learning experience for a creator listed on /api/v1/student . Changing jokes about Chuck Norris can be found at: /api/v1/norris to change a joke, refresh the page.");
	}

}
