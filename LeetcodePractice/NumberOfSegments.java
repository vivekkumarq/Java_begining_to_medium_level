package LeetcodePractice;

public class NumberOfSegments {
    public static void main(String[] args) {
        String s1 = "Hello, my name is John";
        System.out.println(countSegments(s1)); 

        String s2 = "Hello";
        System.out.println(countSegments(s2)); 

        String s3 = "   "; 
        System.out.println(countSegments(s3)); 

        String s4 = "   a b  c  ";
        System.out.println(countSegments(s4)); 
    }

    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}

