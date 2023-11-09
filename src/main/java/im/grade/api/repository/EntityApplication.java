package im.grade.api.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EntityApplication {
	public static void main(String[] args) {
		SpringApplication.run(EntityApplication.class, args);
	}

}
