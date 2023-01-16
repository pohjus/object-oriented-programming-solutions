public class Main {
    public static String repeat1(char character, int amount) {
        String repeated = "";
        for (int i = 0; i < amount; i++) {
            repeated += character;
        }
        return repeated;
    }

    public static void repeat2(char character, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(character);
        }
    }
}
