import model.Contact;
import controller.ContactsController;
import java.io.Console;

public class Main {
    public static void main(String [] args) {
        Console c = System.console();
        ContactsController cc = new ContactsController();
        boolean running = true;
        do {
            System.out.println();
            System.out.println("1) display contacts\n" + "2) add a new contact\n" + "3) remove a contact\n" + "4) exit program");
            int answer = Integer.parseInt(c.readLine());
            System.out.println();
            switch (answer) {
                case 1:
                    cc.getAll(false);
                    break;
                case 2:
                    String name = c.readLine("Please give a name: ");
                    String personalId = c.readLine("Please give your Personal Identification Number: ");
                    Contact person = new Contact(name, personalId);
                    if (person.getName() == null || person.getId() == null) {
                        System.out.println("Cannot add to contacts due to 1 or more errors");
                        break;
                    } else {
                        cc.add(person.toString());
                    }
                    break;
                case 3:
                    cc.getAll(true);
                    String select = c.readLine("Please pick a contact to remove from above list using a corresponding number: ");
                    cc.remove(select);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Please give a value between 1-4");
            }
        } while (running);
    }
}
