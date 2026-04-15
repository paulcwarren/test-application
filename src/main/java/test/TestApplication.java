package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		System.setProperty("my.custom.property", "debt_trigger");
		SpringApplication.run(TestApplication.class, args);
	}
}
