import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String [] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        Stream<String> stream = list.stream();
        IntStream intStream = stream.mapToInt((str) -> Integer.parseInt(str));
        intStream.forEach((value) -> System.out.println(value));
    }
}
