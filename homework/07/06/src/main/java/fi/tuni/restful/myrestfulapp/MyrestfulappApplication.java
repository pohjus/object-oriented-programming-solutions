package fi.tuni.restful.myrestfulapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyrestfulappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyrestfulappApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("hello world");
	}
}
