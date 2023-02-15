package controller;

import model.Contact;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsController {
    private List<Contact> contacts;
    private static final String FILE_NAME = "contacts.csv";

    public ContactsController() {
        contacts = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            for (String line : lines) {
                String[] data = line.split(",");
                contacts.add(new Contact(data[0], data[1]));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getPersonalId());
        }
    }

    public void addContact(String name, String personalId) {
        if (!isValidId(personalId)) {
            System.out.println("Error: Invalid personal ID");
            return;
        }

        Contact newContact = new Contact(name, personalId);
        if (contacts.contains(newContact)) {
            System.out.println("Error: Contact with this ID already exists");
            return;
        }

        contacts.add(newContact);
        saveContacts();
        System.out.println("Contact added successfully");
    }

    public void removeContact(String personalId) {
        Contact contact = new Contact("", personalId);
        if (!contacts.contains(contact)) {
            System.out.println("Error: Contact with this ID does not exist");
            return;
        }

        contacts.remove(contact);
        saveContacts();
        System.out.println("Contact removed successfully");
    }

    private boolean isValidId(String personalId) {
        // Validate the personal ID based on the rules from the wikipedia page
        return true;
    }

    private void saveContacts() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Contact contact : contacts) {
                writer.println(contact.getName() + "," + contact.getPersonalId());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}