package com.ginc.Grent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class GrentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrentApplication.class, args);
	}

}
