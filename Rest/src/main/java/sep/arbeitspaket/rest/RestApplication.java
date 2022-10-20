package sep.arbeitspaket.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sep.arbeitspaket.rest.adress.Adress;
import sep.arbeitspaket.rest.person.Person;
import sep.arbeitspaket.rest.person.PersonRepository;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
