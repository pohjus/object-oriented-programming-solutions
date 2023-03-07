import java.io.IOException;
import java.util.stream.Stream;
import java.nio.file.*;

public class Main {
    public static void main(String [] args) {
        try {
            Stream<Path> walk = Files.walk(Paths.get(".\\"), 1)
                                    .filter(item -> item.getFileName().toString().endsWith(".java"));
            walk.forEach(file -> {
                System.out.println(file);
                try {
                    Stream<String> stream = Files.readAllLines(file).stream();
                    stream.filter(item -> item.contains("\t"))
                        .map(item -> item.replaceAll("\t", "____"))
                        .forEach(System.out::println);
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}