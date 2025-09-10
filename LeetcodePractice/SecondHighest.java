package LeetcodePractice;

import java.util.*;

public class SecondHighest {
    public int secondHighest(String s) {
        TreeSet<Integer> set = new TreeSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) set.add(c - '0');
        }
        if (set.size() < 2) return -1;
        set.pollLast();
        return set.last();
    }

    public static void main(String[] args) {
        SecondHighest sol = new SecondHighest();
        System.out.println(sol.secondHighest("dfa12321afd"));
        System.out.println(sol.secondHighest("abc1111"));
    }
}
