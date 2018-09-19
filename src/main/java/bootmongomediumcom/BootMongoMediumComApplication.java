package bootmongomediumcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableMongoAuditing
@EnableReactiveMongoRepositories
@SpringBootApplication
public class BootMongoMediumComApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMongoMediumComApplication.class, args);
	}
}
