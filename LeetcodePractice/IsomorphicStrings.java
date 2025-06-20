package LeetcodePractice;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Set<Character> mapped = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) return false;
            } else {
                if (mapped.contains(chT)) return false;
                mapST.put(chS, chT);
                mapped.add(chT);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));   
        System.out.println(isIsomorphic("foo", "bar"));  
        System.out.println(isIsomorphic("paper", "title"));
    }
}

