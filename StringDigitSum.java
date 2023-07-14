import java.util.Scanner;

public class StringDigitSum {
    public static int sumDigits(int n) {

        if(n == 0){
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int result = sumDigits(n);

        System.out.println(result);
    }
}
