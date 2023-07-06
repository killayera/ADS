import java.util.Scanner;

public class powerCalculator {
    public static double calculatePower(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * calculatePower(a, n - 1);
        } else {
            return 1 / (a * calculatePower(a, -n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double base = input.nextDouble();


        int exponent = input.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(result);

        input.close();
    }
}