abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }

    abstract void makeSound();
}
