public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50 + 1);
            sum += arr[i];
        }

        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}