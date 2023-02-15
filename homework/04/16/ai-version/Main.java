import controller.ContactsController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactsController contactsController = new ContactsController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) Display contacts");
            System.out.println("2) Add a new contact");
            System.out.println("3) Remove a contact");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    contactsController.displayContacts();
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter personal ID: ");
                    String personalId = scanner.nextLine();
                    contactsController.addContact(name, personalId);
                    break;
                case 3:
                    System.out.print("Enter personal ID: ");
                    personalId = scanner.nextLine();
                    contactsController.removeContact(personalId);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}