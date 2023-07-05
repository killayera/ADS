import java.util.Scanner;

public class primeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }

        input.close();
    }
}