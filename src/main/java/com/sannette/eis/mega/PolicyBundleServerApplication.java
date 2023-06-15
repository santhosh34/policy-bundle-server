package com.sannette.eis.mega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class PolicyBundleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolicyBundleServerApplication.class, args);
	}

}
