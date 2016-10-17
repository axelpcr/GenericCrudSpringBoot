package crm.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class PersonalCrmApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PersonalCrmApplication.class, args);
	}
}
