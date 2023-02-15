public class Main {
    public static void main(String [] args) {
        SoftDrink cocacola = new SoftDrink();
        cocacola.sell();
        Bird b = new Bird();
        b.sell();
        Dog d = new Dog();
        d.sell();

        method(new SoftDrink());
        method(new Bird());
        method(new Dog());
    }

    // this method can receive any object that implements SellableItem interface
    public static void method(SellableItem a) {
        a.sell();
    }
}