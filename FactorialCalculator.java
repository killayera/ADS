import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int result = factorial(number);
        System.out.println(result);
        input.close();
    }
}