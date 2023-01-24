import java.util.*;
/**
 * @author Otto Kyösti
 * @author Jussi Pohjolainen
 */
class MyString {
    private char [] data;

    public MyString(char [] data) {
        this.data = Arrays.copyOf(data, data.length);
    }

    public int length() {
        return this.data.length;
    }

    public char charAt(int index) {
        if (index >= this.data.length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of range");
        } else {
            return this.data[index];
        }
    }

    public boolean equals(MyString mj) {
        for (int i = 0; i < data.length; i++) {
            if (mj.data[i] != this.data[i]) {
                return false;
            }
        }
        return true;
    }

    public MyString reverse() {
        char[] reversedArray = new char[this.data.length];

        int j = 0;
        for(int i = reversedArray.length - 1; i >= 0; i--) {
            reversedArray[j] = this.data[i];
            j++;
        }

        return new MyString(reversedArray);
    }

    public boolean startsWith(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(data[i] == str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return new String(this.data);
    }
}

public class Main {
    public static void main(String [] args) {
        char [] data = {'m', 'o', 'i'};
        MyString mj = new MyString(data);

        System.out.println(mj.length());
        System.out.println(mj.charAt(0));
        System.out.println(mj.equals(mj));
        System.out.println(mj.reverse());
        System.out.println(mj.startsWith("mo"));
    }
}
