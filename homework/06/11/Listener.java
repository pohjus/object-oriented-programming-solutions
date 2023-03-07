import java.util.function.ToIntFunction;

public class Listener implements ToIntFunction<String> {
    public int applyAsInt(String str) {
        return Integer.parseInt(str);
    }
}
