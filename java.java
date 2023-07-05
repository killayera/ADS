import java.util.Scanner;

public class java {
    public static double calculateAverage(int n, int[] arr) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        double average = (double) total / n;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = input.nextInt();
        }

        double result = calculateAverage(n, elements);
        System.out.println(result);

        
    }
}
