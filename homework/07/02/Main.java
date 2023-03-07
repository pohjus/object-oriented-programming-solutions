import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String [] args) {
        Optional<Person> person = findPersonById(Integer.parseInt(args[0]));
        if (person.isPresent()) {
            print(person.get().name());
        } else {
            print("Id not present in list");
        }
    }
    
    public static void print(Object o) {
        System.out.println(o);   
    }

    public static Optional<Person> findPersonById(int id) {
        var people = List.of(new Person(1, "jack"), new Person(2, "tina"));
        for (Person person : people) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}