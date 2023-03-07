package fi.tuni.restful.myrestfulapp;

import jakarta.annotation.PostConstruct;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    ArrayList<Customer> customers = new ArrayList<Customer>(Arrays.asList(new Customer(1, "jack"),
                                                                          new Customer(2, "jake"),
                                                                          new Customer(3, "jill"),
                                                                          new Customer(4, "james")));

    @GetMapping("customers/")
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("customers/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customers.stream().filter(customer -> customer.getId() == id).findFirst().get();
    }
}
