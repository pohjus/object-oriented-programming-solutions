public class Main {
    public static void main(String [] args) {
        Human jussi = new Human("Jussi");
        Dog spot = new Dog("Spot");
        if(jussi.eats(spot)) {
            System.out.println("Success!");
            System.out.println(spot.isAlive());
            System.out.println(jussi.getHealthAmount());
        }
    }
}