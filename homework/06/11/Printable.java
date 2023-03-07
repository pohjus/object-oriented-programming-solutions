import java.util.function.IntConsumer;

public class Printable implements IntConsumer {
    public void accept(int value) {
        System.out.println(value);
    }
}
