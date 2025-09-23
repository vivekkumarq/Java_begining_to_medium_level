package LeetcodePractice;

public class ReversePrefix {
     public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();
        sb.append(word.substring(index + 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        ReversePrefix sol = new ReversePrefix();
        System.out.println(sol.reversePrefix("abcdefd", 'd')); 
        System.out.println(sol.reversePrefix("xyxzxe", 'z'));
        System.out.println(sol.reversePrefix("abcd", 'z'));   
    }
}
