package com.thomasbockhorn.stoicjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StoicjournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoicjournalApplication.class, args);
	}


}
