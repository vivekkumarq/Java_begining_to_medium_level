package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        int n3 = 15;

        System.out.println("Input: " + n1 + " -> Output: " + fizzBuzz(n1));
        System.out.println("Input: " + n2 + " -> Output: " + fizzBuzz(n2));
        System.out.println("Input: " + n3 + " -> Output: " + fizzBuzz(n3));
    }
}

