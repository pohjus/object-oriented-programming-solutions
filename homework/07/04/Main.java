import java.util.*;

public class Main {
    public static void main(String [] args) {
        Database db = new Database();
        PersonMapper mapper = new PersonMapper();
        Optional<Person> person = db.findPerson(2).flatMap(mapper::fromStringToPerson);
        person.ifPresent(System.out::println);
    }
}
