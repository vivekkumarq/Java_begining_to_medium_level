package LeetcodePractice;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2)); // Output: 134

        num1 = "456";
        num2 = "77";
        System.out.println(addStrings(num1, num2)); // Output: 533

        num1 = "0";
        num2 = "0";
        System.out.println(addStrings(num1, num2)); // Output: 0
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int currentDigit = sum % 10;

            result.append(currentDigit);

            i--;
            j--;
        }

        
        return result.reverse().toString();
    }
}

