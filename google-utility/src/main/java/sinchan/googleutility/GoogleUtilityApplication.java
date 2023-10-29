package sinchan.googleutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoogleUtilityApplication {

	public static void main(String[] args) {
		System.out.println("Project is deployed at "+ System.currentTimeMillis());
		SpringApplication.run(GoogleUtilityApplication.class, args);
	}

}
