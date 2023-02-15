package util;

import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> list = new ArrayList<>();

    @SafeVarargs
    private MyList(T... a) {
        for (T element : a) {
            list.add(element);
        }
    }

    @SafeVarargs
    static public <T> ArrayList<T> of(T... a) {
        MyList<T> myList = new MyList<>(a);
        return myList.list;
    }
}