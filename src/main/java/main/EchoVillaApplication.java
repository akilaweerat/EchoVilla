package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.echovilla")
@SpringBootApplication
public class EchoVillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoVillaApplication.class, args);
	}
}
