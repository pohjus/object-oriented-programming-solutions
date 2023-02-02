import java.util.*;

public class Team {
    private String name;
    private Person [] players = new Person[20];
    private int size = 0;

    public Team(String name) {
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

    public void add(Person person) {
        if (size >= this.players.length) {
            this.players = Arrays.copyOf(this.players, this.players.length + 20);
            this.players[size] = person;
        }
        
        this.players[size++] = person;
    }

    public Person get(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.players[index];
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String str = getName() + ": ";
        for (int i = 0; i < this.size; i++) {
            str += this.players[i] + ", ";
        }
        return str;
    }
}