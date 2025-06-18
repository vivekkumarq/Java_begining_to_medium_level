package LeetcodePractice;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        s = s.trim();  
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }

   
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));               // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));    // 6
    }
}

