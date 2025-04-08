package LeetcodePractice;
public class StringDivisor {
    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

      
        int gcdLength = gcd(str1.length(), str2.length());

        
        return str1.substring(0, gcdLength);
    }

    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
       
        
        System.out.println(gcdOfStrings("ABCABC", "ABC")); 
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); 
        System.out.println(gcdOfStrings("LEET", "CODE")); 
    }
}