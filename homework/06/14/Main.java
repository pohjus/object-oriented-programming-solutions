import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String [] args) {
        try {
            List<String> list = Files.readAllLines(Paths.get(".\\" + args[0]));
            Stream<String> stream = list.stream();
            stream.filter((item) -> item.contains("\t"))
                .map((item) -> item.replaceAll("\t", "____"))
                .forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
