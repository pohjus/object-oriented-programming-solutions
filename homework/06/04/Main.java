class Shape {
    public int x;
    public int y;
}

abstract class Mammal {
    public void giveBirth() {
         System.out.println("Giving birth");
    }
    abstract void makeSound();
}
 
interface Sellable {
    public void sell();
}
 
interface MyMouseListener {
    public void mouseEntered();
    public void mouseExited();
}
 
class Main {
    public static void main(String [] args) {
        // Shape will accept instances of shape class and anything that extends it
        Shape shape1 = new Shape();
        Shape shape2 = new Rectangle();

        // Mammal will accept any class that extends it, but you cannot make a new 
        // Mammal class cause it is abstract class
        Mammal mammal = new Dog();

        // Sellable interface accepts any class that implements the Sellable interface
        // (you cannot make a new class out of interface)
        Sellable sellable = new Computer();

        // MyMouseListener interface accepts any class that implements the
        // MyMouseListener interface
        // (you cannot make a new class out of interface)
        MyMouseListener myMouseListener = new MyWindow();
    }
}
