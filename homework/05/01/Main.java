public class Main {
    public static void main(String [] args) {
        // Mammal is abstract; cannot be instantiated
        // Mammal m = new Mammal();
        
        // Dog d = new Dog();
        // d.giveBirthToLivingChild();

        Dog spot = new Dog("Spot");
        System.out.println(spot.getName());
        spot.giveBirthToLivingChild();
    }
}