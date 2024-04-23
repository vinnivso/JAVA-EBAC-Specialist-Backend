package com.ebac.strangleruserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ebac.strangleruserservice.repository")
public class StranglerUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StranglerUserServiceApplication.class, args);
	}

}
