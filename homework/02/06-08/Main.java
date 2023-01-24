import java.awt.*;
import java.util.*;
import java.io.*;

// The main difference between array and ArrayList is that to declare an array you have 
// specify it's size and it is fixed
//
// ArrayList is dynamic and rezisable array that grows or shrinks when values are added or removed

/**
 * @author Otto Kyösti
 * @author Jussi Pohjolainen
 */
public class Main {
    /**
    * @author Jussi Pohjolainen
    */
    public static Color toColor(String input) {
        String [] values = input.split(",");
        if(values.length != 3) {
            throw new IllegalArgumentException("too many arguments, example: 255,100,200");
        }
        
        int r = Integer.parseInt(values[0]);
        int g = Integer.parseInt(values[1]);
        int b = Integer.parseInt(values[2]);

        return new Color(r, g, b);
    }

    /**
    * @author Jussi Pohjolainen
    */
    public static void colorExercise() {
        Console console = System.console();
        var listOfColors = new ArrayList<Color>();

        print("Give color values (answer exit if you want to quit)");

        String input = "";

        // Continue the loop until user gives "exit", "Exit", "EXIT"
        while(!(input = console.readLine()).equalsIgnoreCase("exit")) {
            try {
                listOfColors.add(toColor(input));  // Color c = toColor("255,255,255")
            } catch(NumberFormatException e) {
                System.out.println("Give numbers.");
            } catch(IllegalArgumentException e) {
                System.out.println("Please give input like: 255,10,200 and use rgb values 0 - 255.");
            }
        }

        for(Color color: listOfColors) {
            System.out.println(color);
        }
    }

    public static void main(String [] args) {
        colorTest()
        listSetMap();
        colorExercise();
    }

    /**
    * @author Otto Kyösti
    */
    public static void colorTest() {
        // This throws an error saying Color parameter outside of expected range
        // Color a = new Color(256, 0, 0, 123);
        Color c1 = new Color(255, 0, 0, 123);
        Color c2 = new Color(123, 123, 123, 123);
        // This return a new Color that is darker version if this Color (rgb values are lower)
        Color darker = c2.darker();
        // This return a new Color that is brighter version if this Color (rgb values are brighter)
        Color brighter = c2.brighter();
        // This returns either true or false, depending if the rgb values are the same or not
        System.out.println(c1.equals(c2));
        System.out.println(brighter.toString());       
        System.out.println(darker.toString());
        // This returns a string representation of this Color.
        System.out.println(c1.toString());
    }

    /**
    * @author Otto Kyösti
    */
    public static void listSetMap() {
        // In summary, List stores a ordered collection of elements that can contain duplicates, 
        // Set stores a unordered collection of unique elements, Map stores key value pairs and keys are unique.
        // Courtesy of ChatGPT :)
        ArrayList<String> aList = new ArrayList<String>();
        System.out.println("Strings to add: heikki, jorma, heikki");
        aList.add("heikki");
        aList.add("jorma");
        aList.add("heikki");
        System.out.println("List example(ArrayList): " + aList + "\n");
        HashSet<String> hSet = new HashSet<String>();
        System.out.println("Strings to add: heikki, jorma, heikki");
        hSet.add("heikki");
        hSet.add("jorma");
        hSet.add("heikki");
        System.out.println("Set example(HashSet): " + hSet + "\n");
        HashMap<String, String> hMap = new HashMap<String, String>();
        System.out.println("Strings to add: nimi1=heikki, nimi2=jorma, nimi1=heikki");
        hMap.put("nimi1", "heikki");
        hMap.put("nimi2", "jorma");
        hMap.put("nimi1", "heikki");
        System.out.println("Map example(HashMap): " + hMap);
    }
}