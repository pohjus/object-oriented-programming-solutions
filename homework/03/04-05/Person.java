public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("name not valid: too short");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}