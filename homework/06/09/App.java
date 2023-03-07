public class App {
    public static void main(String [] args) {
        flyMe(() -> System.out.println("flying"));
    }
    
    public static void flyMe(Flyable a) {
        a.fly();
    }
}
