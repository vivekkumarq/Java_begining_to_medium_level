package LeetcodePractice;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");  
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        
        
        System.out.println(reverseWords("Mr Ding"));
        
    }
}

