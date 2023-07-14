import java.util.Scanner;

public class StringDigitSum {
    public static int sumDigits(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        char firstChar = str.charAt(0);
        int digitSum = Character.isDigit(firstChar) ? Character.getNumericValue(firstChar) : 0;

        return digitSum + sumDigits(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int result = sumDigits(input);
        System.out.println(result);
    }
}