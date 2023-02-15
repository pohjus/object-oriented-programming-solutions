public class Human extends Mammal {

    public Human(String name) {
        super(name);
    }
    
    public void createArt() {
        System.out.println("creates art");
    }

    public void makeSound() {
        System.out.println("human noises");
    }
}
