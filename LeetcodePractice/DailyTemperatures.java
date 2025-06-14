package LeetcodePractice;
import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }


            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return answer;
    }

    
    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();

        int[] result1 = dt.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        int[] result2 = dt.dailyTemperatures(new int[]{30,40,50,60});
        int[] result3 = dt.dailyTemperatures(new int[]{30,60,90});

        System.out.println("Output 1: " + java.util.Arrays.toString(result1)); 
        System.out.println("Output 2: " + java.util.Arrays.toString(result2)); 
        System.out.println("Output 3: " + java.util.Arrays.toString(result3));
    }
}

