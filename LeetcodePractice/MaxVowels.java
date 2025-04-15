package LeetcodePractice;
public class MaxVowels {
    public int maxVowels(String s, int k) {
        int maxCount = 0, currentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }

          
            if (i >= k && isVowel(s.charAt(i - k))) {
                currentCount--;
            }

            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        MaxVowels sol = new MaxVowels();

        System.out.println(sol.maxVowels("abciiidef", 3)); 
        System.out.println(sol.maxVowels("aeiou", 2));    
        System.out.println(sol.maxVowels("leetcode", 3)); 
    }
    
}
