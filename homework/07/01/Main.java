public class Main {    
    public static void main(String [] args) {
        var jack1 = new Person(1, "jack", "smith");
        var jack2 = new Person(1, "jack", "smith");
        print(jack1.equals(jack2)); // true, compares the attributes
        print(jack1.id());          // 1
        print(jack1.firstName());   // jack
        print(jack1.lastName());    // smith
        print(jack1);               // Person[id=1, firstName=jack, lastName=smith]
    }
    public static void print(Object o) {
        System.out.println(o);   
    }
}