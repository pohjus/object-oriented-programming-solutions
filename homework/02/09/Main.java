
/**
 * @author Otto Kyösti
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String [] args) {

        // Autoboxing means that Java has the ability to convert primitive data types
        // into their corresponding classes and back when needed, which means you can
        // create a new integer using either x = new Integer(1)(though this is deprecated)
        // or simply writing the number like x = 1(<-- in this case Java behind the scenes
        // when compiling converts this to new Integer(1))
        
        // double -> Double
        Double d = 5.5;

        // Integer -> int
        int x = new Integer(5);  // depricated, will give a warning
    }
}
