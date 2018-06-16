package edu.spring.boot.bootwithdb;

import edu.spring.boot.bootwithdb.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//(scanBasePackages = "edu.spring.boot.bootwithdb")
public class BootWithDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {BootWithDbApplication.class, JpaConfig.class}, args);
	}
}
