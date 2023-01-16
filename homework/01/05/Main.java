public class Main {
    public static char[][] getRandomTable(int height, int width) {
        char[][] table = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                table[i][j] = Math.random() > 0.5 ? 'x' : '-';
            }
        }
        return table;
    }

    public static void output(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] table = getRandomTable(4, 4);
        output(table);
    }
}