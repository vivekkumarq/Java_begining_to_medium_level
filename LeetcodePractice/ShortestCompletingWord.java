package LeetcodePractice;

public class ShortestCompletingWord {
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] targetCount = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                targetCount[c - 'a']++;
            }
        }

        String result = null;
        for (String word : words) {
            if (isCompleting(word, targetCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    private boolean isCompleting(String word, int[] targetCount) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] < targetCount[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ShortestCompletingWord sol = new ShortestCompletingWord();
        String[] words1 = {"step","steps","stripe","stepple"};
        System.out.println(sol.shortestCompletingWord("1s3 PSt", words1)); // steps

        String[] words2 = {"looks","pest","stew","show"};
        System.out.println(sol.shortestCompletingWord("1s3 456", words2)); // pest
    }
}

