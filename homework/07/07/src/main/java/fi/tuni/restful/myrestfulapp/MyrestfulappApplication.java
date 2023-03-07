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
		Customer customer1 = new Customer();
		Customer customer2 = new Customer(1, "heikki");
		System.out.println(customer2.getName());
		System.out.println(customer2.getId());
		System.out.println(customer1.getName());
		customer1.setName("joonas");
		System.out.println(customer1.getName());
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer1.equals(customer2));
	}
}
