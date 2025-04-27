package LeetcodePractice;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); 
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0; 
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch); 
            }
        }

        return currentString.toString();
    }
    public static void main(String[] args) {
        DecodeString solution = new DecodeString();

        System.out.println(solution.decodeString("3[a]2[bc]"));     
        System.out.println(solution.decodeString("3[a2[c]]"));      
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
    }
    
}
