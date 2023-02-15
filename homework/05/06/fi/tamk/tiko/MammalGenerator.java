package fi.tamk.tiko;

public abstract class MammalGenerator {
    public void launch(String... args) {
        if (args.length == 0) {
            System.out.println("No argument given");
            return;
        }

        if (args[0].equalsIgnoreCase("Dog")) {
            this.start(new Dog());
        } else {
            this.start(new Human());
        }
    }

    public abstract void start(Mammal mammal);
}