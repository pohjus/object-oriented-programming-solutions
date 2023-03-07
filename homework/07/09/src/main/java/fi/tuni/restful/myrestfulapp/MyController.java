package fi.tuni.restful.myrestfulapp;

import jakarta.annotation.PostConstruct;

import java.util.*;
import java.util.stream.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    List<Customer> customers = new ArrayList<Customer>(Arrays.asList(new Customer(1, "jack"),
                                                                     new Customer(2, "jake"),
                                                                     new Customer(3, "jill"),
                                                                     new Customer(4, "james")));

    @GetMapping("customers/")
    public List<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("customers/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customers.stream().filter(customer -> customer.getId() == id).findFirst().get();
    }

    @DeleteMapping("customers/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customers = customers.stream().filter(customer -> customer.getId() != id).collect(Collectors.toList());
    }

    @PostMapping("customers/")
    public Customer addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customers.get(customers.size() - 1);
    }
}
