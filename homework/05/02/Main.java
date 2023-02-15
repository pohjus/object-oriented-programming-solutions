public class Main {
    public static void main(String [] args) {
        Dog spot = new Dog("Spot");
        spot.giveBirthToLivingChild();
        spot.sniffButt();
        spot.makeSound();

        Human heikki = new Human("Heikki");
        heikki.giveBirthToLivingChild();
        heikki.createArt();
        heikki.makeSound();

        Bird b = new Bird("name");
        b.fly();
    }
}