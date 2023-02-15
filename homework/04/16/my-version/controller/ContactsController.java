package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactsController {

    public ContactsController() {
        try {
            List<String> list = Files.readAllLines(Paths.get(".\\contacts.csv"));
            if (list.isEmpty()) {
                Files.writeString(Paths.get(".\\contacts.csv"), "id,name\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void getAll(boolean isRemove) {
        try {
            List<String> list = Files.readAllLines(Paths.get(".\\contacts.csv"));
            for (int i = 1; i < list.size(); i++) {
                String [] strs = list.get(i).split(",");
                if (isRemove) {
                    System.out.println(i + ". " + strs[0] + " " + strs[1]);
                } else {
                    System.out.println(strs[0] + " " + strs[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void remove(String select) {
        int removeId = Integer.parseInt(select);
        try {
            List<String> list = Files.readAllLines(Paths.get(".\\contacts.csv"));
            if (removeId > 0 && removeId < list.size()) {
                list.remove(removeId);
                Files.write(Paths.get(".\\contacts.csv"), list);
                System.out.println("Contact removed successfully");
            } else {
                System.out.println("Given number out of range for contacts");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void add(String person) {
        try {
            if (checkExisting(person)) {
                System.out.println("Contact already exists in the file");
            } else {
                Files.writeString(Paths.get(".\\contacts.csv"), person + "\n", StandardOpenOption.APPEND);
                System.out.println("Contact succesfully created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private boolean checkExisting(String person) {
        String [] personAttr = person.split(",");
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            List<String> list = Files.readAllLines(Paths.get(".\\contacts.csv"));
            list.forEach(item -> {
                String [] attr = item.split(",");
                fileData.add(attr[0]);
                fileData.add(attr[1]);
            });
            return (fileData.contains(personAttr[0])) ? true : false;
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }
}
