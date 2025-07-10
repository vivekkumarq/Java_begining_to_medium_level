package LeetcodePractice;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd")); // Output: "dc-ba"
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj")); // Output: "j-Ih-gfE-dCba"
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!")); // Output: "Qedo1ct-eeLg=ntse-T!"
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                // Swap letters
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}

