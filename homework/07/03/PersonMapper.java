public class PersonMapper {
    public Person fromStringToPerson(String line) {
        String [] person = line.split("::");
        return new Person(Integer.parseInt(person[0]), person[1], person[2]);
    }
}