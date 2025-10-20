package LeetcodePractice;

import java.util.Stack;

public class MakeStringGreat {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
         
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop(); 
            } else {
                stack.push(c); 
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "leEeetcode";
        System.out.println(makeGood(s1)); 

        String s2 = "abBAcC";
        System.out.println(makeGood(s2)); 

        String s3 = "s";
        System.out.println(makeGood(s3)); 
    }
}
