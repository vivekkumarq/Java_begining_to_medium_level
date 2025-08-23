package LeetcodePractice;

public class BalancedString {
    public static boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (i % 2 == 0) evenSum += digit;
            else oddSum += digit;
        }
        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("1234"));
        System.out.println(isBalanced("24123"));
    }
}
