public class Main {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOUÄÖÅÄäöå]", "");
    }

    public static int countString(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static int[] sumRow(int[][] arr) {
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }
}