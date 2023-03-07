import java.util.*;

public class PersonMapper {
    public Optional<Person> fromStringToPerson(String line) {
        String [] person = line.split("::");
        if (person.length == 3) {
            return Optional.of(new Person(Integer.parseInt(person[0]), person[1], person[2]));
        }
        return Optional.empty();
    }
}