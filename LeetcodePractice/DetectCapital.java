package LeetcodePractice;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG")); 
        System.out.println(detectCapitalUse("Google")); 
        System.out.println(detectCapitalUse("leetcode"));
    }

    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 0) return true;

        if (isAllUpper(word)) {
            return true;
        }

        if (isAllLower(word)) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) && isAllLower(word.substring(1))) {
            return true;
        }

        return false;
    }

    private static boolean isAllUpper(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAllLower(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}

