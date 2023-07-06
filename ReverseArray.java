import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = input.nextInt();
        }

        reverseArray(elements, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(elements[i] + " ");
        }

        input.close();
    }
}