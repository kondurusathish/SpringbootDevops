package com.springbootdevops.sprinbootdevopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDevopsIntegrationApplication {

	@GetMapping("/")
	 public String welcome()
	 {
		 return "welcome";
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevopsIntegrationApplication.class, args);
	}

}
