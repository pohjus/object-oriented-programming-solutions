public class Test {
    public static void main(String [] args) {
        Outer o = new Outer();
        o.createInner().print();

        Outer.Inner oi = new Outer().new Inner();
        oi.print(); 
    }
}