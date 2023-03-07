public class Outer {

    // public Inner createInner() {
    //     return new Inner();
    // }

    public void doSomething() {
        int a = 12;
        final int b = 99;
        int c = 13;
        c = 14;
        class Inner {
            public void print() {
                // this works because a is initiated with a value and never changed after
                System.out.println(a);
                // this works because b cannot be changed after initialization (final)
                System.out.println(b);
                // this doesn't work because c is changed after initialization (is not final
                // or effectively final)
                // System.out.println(c);
            }
        }
        Inner i = new Inner();
        i.print();
    }
}
