package com.example.springandgcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringAndGcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndGcpApplication.class, args);
	}

	@RequestMapping("/api/v1/")
	@RestController
	public class GreetingsController {
		@GetMapping("/greet")
		public ResponseEntity<String> greet() {
			return ResponseEntity.ok().body("Hello there!");
		}
	}
}
