import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = sc.next().charAt(0);

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Character not found in string");
        } else {
            System.out.println("First index of character '" + searchChar + "' in string '" + str + "' is: " + index);
        }
    }
}