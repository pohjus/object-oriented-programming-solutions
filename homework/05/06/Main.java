import fi.tamk.tiko.Mammal;
import fi.tamk.tiko.MammalGenerator;

public class Main extends MammalGenerator {
    public void start(Mammal mammal) {
        mammal.makeSound();
    }
    public static void main(String... args) {
        new Main().launch(args);
    }
}
