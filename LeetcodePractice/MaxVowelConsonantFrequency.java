package LeetcodePractice;

public class MaxVowelConsonantFrequency {
    public static int maxVowelConsonantSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        String vowels = "aeiou";
        int maxVowel = 0, maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (freq[i] > 0) {
                if (vowels.indexOf(ch) != -1) {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }

    public static void main(String[] args) {
        System.out.println(maxVowelConsonantSum("successes")); 
        System.out.println(maxVowelConsonantSum("aeiaeia"));  
    }
}

