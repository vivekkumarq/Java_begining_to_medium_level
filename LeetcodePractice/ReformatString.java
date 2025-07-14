package LeetcodePractice;

import java.util.*;

public class ReformatString {
    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2")); 
        System.out.println(reformat("leetcode")); 
        System.out.println(reformat("1229857369")); 
        System.out.println(reformat("covid2019")); 
    }

    public static String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            } else if (Character.isDigit(c)) {
                digits.add(c);
            }
        }

        if (Math.abs(letters.size() - digits.size()) > 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        boolean letterTurn = letters.size() >= digits.size();

        int i = 0, j = 0;
        while (i < letters.size() || j < digits.size()) {
            if (letterTurn && i < letters.size()) {
                sb.append(letters.get(i++));
            } else if (!letterTurn && j < digits.size()) {
                sb.append(digits.get(j++));
            }
            letterTurn = !letterTurn;
        }

        return sb.toString();
    }
}

