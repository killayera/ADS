import java.util.Scanner;

public class DigitChecker {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return false;
        }

        if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        }

        return Character.isDigit(s.charAt(0)) && isAllDigits(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        boolean result = isAllDigits(s);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        input.close();
    }
}