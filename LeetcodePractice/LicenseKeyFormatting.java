package LeetcodePractice;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println(licenseKeyFormatting(s1, k1));

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println(licenseKeyFormatting(s2, k2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder cleaned = new StringBuilder();
        
      
        for (char c : s.toCharArray()) {
            if (c != '-') {
                cleaned.append(Character.toUpperCase(c));
            }
        }

        StringBuilder result = new StringBuilder();
        int length = cleaned.length();
        int firstGroupLength = length % k;

        int index = 0;
        if (firstGroupLength > 0) {
            result.append(cleaned.substring(0, firstGroupLength));
            index = firstGroupLength;
        }

        while (index < length) {
            if (result.length() > 0) {
                result.append('-');
            }
            result.append(cleaned.substring(index, index + k));
            index += k;
        }

        return result.toString();
    }
}

