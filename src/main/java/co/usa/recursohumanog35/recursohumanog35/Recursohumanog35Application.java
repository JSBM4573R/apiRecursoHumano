package co.usa.recursohumanog35.recursohumanog35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"co.usa.recursohumanog35.recursohumanog35.model"})
@SpringBootApplication
public class Recursohumanog35Application {

	public static void main(String[] args) {
		SpringApplication.run(Recursohumanog35Application.class, args);
	}

}
