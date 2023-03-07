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
    // Demonstrating the possibilities
    private static int w = 25;
    public static void main(String [] args) {
        // Demonstrating the possibilities
        int h = 10;

        Shape shape = new Shape() {
            // Demonstrating the possibilities
            private int width = w;
            private int height = h;
        };
        Mammal mammal = new Mammal() {
            @Override
            public void makeSound() {
                System.out.println("anonymous noises");
            }
        };
        Sellable sellable = new Sellable() {
            @Override
            public void sell() {
                System.out.println("Anonymous sold");
            }
        };
        MyMouseListener myMouseListener = new MyMouseListener() {
            @Override
            public void mouseEntered() {
                System.out.println("Entered");
            }
        
            @Override
            public void mouseExited() {
                System.out.println("Exited");
            }
        };
    }
}
