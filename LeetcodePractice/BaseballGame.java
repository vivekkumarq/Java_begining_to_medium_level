package LeetcodePractice;

import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        System.out.println(calPoints(ops1)); 

        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops2)); 

        String[] ops3 = {"1","C"};
        System.out.println(calPoints(ops3));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top); // push back original top
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}

