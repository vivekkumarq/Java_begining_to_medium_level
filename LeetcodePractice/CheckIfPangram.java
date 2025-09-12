package LeetcodePractice;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfPangram sol = new CheckIfPangram();
        System.out.println(sol.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); 
        System.out.println(sol.checkIfPangram("leetcode")); 
    }
}
