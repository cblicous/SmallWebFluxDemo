package de.cblicous.smallwebfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "de.cblicous" })
public class SmallDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallDemoApplication.class, args);
	}
}
