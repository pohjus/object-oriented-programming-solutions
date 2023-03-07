public class App {
    public static void main(String [] args) {
        flyMe(new Bird());
        flyMe(new Flyable() {
            public void fly(int speed) {
                System.out.println(speed);
            }
        });
        flyMe((speed) -> System.out.println(speed));
        flyMe(System.out::println);
    }
    
    public static void flyMe(Flyable a) {
        a.fly(20);
    }
}
