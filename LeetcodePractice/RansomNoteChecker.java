package LeetcodePractice;

import java.util.HashMap;

public class RansomNoteChecker {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();

      
        for (char ch : magazine.toCharArray()) {
            magazineCount.put(ch, magazineCount.getOrDefault(ch, 0) + 1);
        }

      
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineCount.containsKey(ch) || magazineCount.get(ch) == 0) {
                return false;
            }
            magazineCount.put(ch, magazineCount.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
   
        System.out.println(canConstruct("a", "b"));      
        System.out.println(canConstruct("aa", "ab"));    
        System.out.println(canConstruct("aa", "aab"));    
    }
}

