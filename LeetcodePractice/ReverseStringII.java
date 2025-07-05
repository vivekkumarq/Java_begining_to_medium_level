package LeetcodePractice;

public class ReverseStringII {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println(reverseStr(s1, k1));

        String s2 = "abcd";
        int k2 = 2;
        System.out.println(reverseStr(s2, k2)); 
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            reverse(chars, left, right);
        }

        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}

