package hr.studiomoderna.backend.studiomoderna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudiomodernaApplication {

	public static void main(String[] args) {
		System.out.println("Krečem");
		SpringApplication.run(StudiomodernaApplication.class, args);
		System.out.println("Pokrenuo sam se");
	}

}
