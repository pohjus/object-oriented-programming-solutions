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
        m1(new Shape());
        m1(new Shape() {
            private int width;
            private int height;
        });
        m2(new Mammal() {
            @Override
            public void makeSound() {
                System.out.println("anonymous noises");
            }
        });
        m3(new Sellable() {
            @Override
            public void sell() {
                System.out.println("Anonymous sold");
            }
        });
        m4(new MyMouseListener() {
            @Override
            public void mouseEntered() {
                System.out.println("Entered");
            }
        
            @Override
            public void mouseExited() {
                System.out.println("Exited");
            }
        });
    }

    public static void m1(Shape obj) {
        // what methods / atttributes I can use from obj?
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
    public static void m2(Mammal obj) {
        // what methods / atttributes I can use from obj?
        obj.giveBirth();
        obj.makeSound();  
    }
    public static void m3(Sellable obj) {
        // what methods / atttributes I can use from obj?
        obj.sell();
    }
    public static void m4(MyMouseListener obj) {
        // what methods / atttributes I can use from obj?
        obj.mouseEntered();
        obj.mouseExited();  
    }
}
