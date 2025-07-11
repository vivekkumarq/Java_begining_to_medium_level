package LeetcodePractice;
import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        System.out.println(mostCommonWord(paragraph1, banned1)); 

        String paragraph2 = "a.";
        String[] banned2 = {};
        System.out.println(mostCommonWord(paragraph2, banned2)); 
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
       
        String normalized = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = normalized.split("\\s+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> countMap = new HashMap<>();

        String mostCommon = "";
        int maxCount = 0;

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
                if (countMap.get(word) > maxCount) {
                    maxCount = countMap.get(word);
                    mostCommon = word;
                }
            }
        }

        return mostCommon;
    }
}

