package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  @Value("${test.config}")
  private String value;

	public static void main(String[] args)
  {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/getValue")
  public String  getValue() {
	  System.out.println("Value is " + value);
	  return value;
  }

}
