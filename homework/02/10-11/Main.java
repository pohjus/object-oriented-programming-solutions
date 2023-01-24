/**
 * @author Otto Kyösti
 */
class PizzaBox<T> {
    private T content;

    public PizzaBox(T thing) {
        this.content = thing;
    }

    public String toString() {
        return "PizzaBox contains " + content.toString();
    }
}

/**
 * @author Otto Kyösti
 */
class Pepperoni {
    public String toString() {
        return "Pepperoni";
    }
}

/**
 * @author Otto Kyösti
 */
class Tropicana {
    public String toString() {
        return "Tropicana";
    }
}

/**
 * @author Otto Kyösti
 */
public class Main {
    public static void main(String [] args) {
        PizzaBox<Pepperoni> pb1 = new PizzaBox<Pepperoni>(new Pepperoni());
        PizzaBox<Tropicana> pb2 = new PizzaBox<Tropicana>(new Tropicana());
        PizzaBox<String> pb3 = new PizzaBox<String>("Perfetta");

        // Possible problems that developer might face when using generics and number
        // is that Integer class does not have same methods that int type has for example
        // int.intValue(). This can be circumvented by declaring that generic type must
        // extend class Number (<T extends Number>). That way every class that is a child
        // of Number class gets access to same methods of Number class. There are also 
        // performance problems regarding boxing and unboxing when using add, multiply etc.
        // while primitive data types can be used directly
        PizzaBox<Integer> pb4 = new PizzaBox<Integer>(4);
        System.out.println(pb1);
        System.out.println(pb2);
        System.out.println(pb3);
        System.out.println(pb4);
    }
}
