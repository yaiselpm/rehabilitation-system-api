package com.killer.rehabilitationsystemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.killer.rehabilitationsystemapi.config.WebFluxConfig;

@SpringBootApplication
public class RehabilitationSystemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RehabilitationSystemApiApplication.class, args);
		// WebFluxConfig config = new WebFluxConfig();
		// config.consume();
	}

}
