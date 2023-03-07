import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Database {
    public Optional<String> findPerson(int id) {
        try {
            return Files.readAllLines(Paths.get(".\\database.txt"))
                                                    .stream()
                                                    .filter(line -> line.startsWith(String.valueOf(id)))
                                                    .findFirst();
        } catch(IOException e) {
            return Optional.empty();
        }
    }
}