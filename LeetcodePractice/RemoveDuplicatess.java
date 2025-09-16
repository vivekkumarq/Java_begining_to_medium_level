package LeetcodePractice;

import java.util.Stack;

public class RemoveDuplicatess {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
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
        RemoveDuplicatess sol = new RemoveDuplicatess();
        System.out.println(sol.removeDuplicates("abbaca")); 
        System.out.println(sol.removeDuplicates("azxxzy")); 
}
}
