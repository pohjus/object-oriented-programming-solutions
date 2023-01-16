public class Main {
    public static String[] getPalindromeStrings(String[] arr) {
        int count = 0;
        for (String str : arr) {
            if (isPalindrome(str)) {
                count++;
            }
        }
        String[] palindromeStrings = new String[count];
        int i = 0;
        for (String str : arr) {
            if (isPalindrome(str)) {
                palindromeStrings[i++] = str;
            }
        }
        return palindromeStrings;
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < (n / 2); i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countStartingCharacter(String[] arr, char c) {
        int count = 0;
        for (String str : arr) {
            if (str.charAt(0) == c) {
                count++;
            }
        }
        return count;
    }
    
    public static String swapFirstLast(String str) {
        if(str.length() > 1) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length()-1);
            return lastChar + str.substring(1, str.length()-1) + firstChar;
        }
        return str;
    }
}