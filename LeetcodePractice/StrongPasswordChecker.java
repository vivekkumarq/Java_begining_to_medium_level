package LeetcodePractice;

public class StrongPasswordChecker {
    public static boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        String special = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (i > 0 && c == password.charAt(i - 1)) return false;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (special.indexOf(c) != -1) hasSpecial = true;
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
        System.out.println(strongPasswordCheckerII("1aB!"));
    }
}

