import java.util.ArrayList;

import util.MyList;

public class Main {
    public static void main(String [] args) {
        ArrayList<String> list1 = MyList.of("hello", "world");
        ArrayList<Integer> list2 = MyList.of(1, 2, 3);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
}
