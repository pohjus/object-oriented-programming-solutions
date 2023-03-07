public class Outer {
    private int x = 12;
    
    public Inner createInner() {
        return new Inner();
    }

    class Inner {
        public void print() {
            System.out.println(x);
        }
    }
}
