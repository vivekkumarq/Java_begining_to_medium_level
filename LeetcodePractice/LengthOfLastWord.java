package LeetcodePractice;

// O(n) time, O(1) space extra. trim the trailing spaces, then measure back to the last space
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim(); 
        int lastSpaceIndex = s.lastIndexOf(' '); 
        return s.length() - lastSpaceIndex - 1;
    }

    
    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));               // 5
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));               // 4

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));               // 6
    }
    
}
