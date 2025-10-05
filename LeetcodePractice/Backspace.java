package LeetcodePractice;

import java.util.Stack;

public class Backspace {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Backspace sol = new Backspace();
        System.out.println(sol.backspaceCompare("ab#c", "ad#c")); 
        System.out.println(sol.backspaceCompare("ab##", "c#d#")); 
        System.out.println(sol.backspaceCompare("a#c", "b"));    
    }
}
