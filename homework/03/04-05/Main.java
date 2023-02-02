import java.util.*;

public class Main {
    public static void main(String [] args) {
        var team = new Team("team");

        var testSize = 99;
        var names = List.of("jack", "tina", "timo", "paul", "john");

        for (int i = 0; i < testSize; i++) {
            team.add(new Person(names.get((int) (Math.random() * names.size()))));
        }

        System.out.println(team.size());
        System.out.println(team.get(0));
        System.out.println(team);
    }
}