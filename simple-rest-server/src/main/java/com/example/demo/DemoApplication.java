package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/strings/{str}")
	public String strings(@PathVariable(name = "str") String str) {
		System.out.println("I got this string: " + str);
		return str;
	}

	@GetMapping("/ints/{int}")
	public Integer ints(@PathVariable(name = "int") Integer integer) {
		System.out.println("I got this int: " + integer);
		return integer;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
