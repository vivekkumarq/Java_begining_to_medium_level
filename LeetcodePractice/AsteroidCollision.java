package LeetcodePractice;
import java.util.Stack;

public class AsteroidCollision {
     public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
         
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                if (stack.peek() < -ast) {
                    stack.pop(); 
                    continue;
                } else if (stack.peek() == -ast) {
                    stack.pop();
                }
               
                ast = 0;
                break;
            }
            if (ast != 0) {
                stack.push(ast);
            }
        }

       
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
        public static void main(String[] args) {
        
    
            int[] asteroids1 = {5, 10, -5};
            System.out.println(asteroidCollision(asteroids1));
    
            int[] asteroids2 = {8, -8};
            System.out.println(asteroidCollision(asteroids2));
    
            int[] asteroids3 = {10, 2, -5};
            System.out.println(asteroidCollision(asteroids3)); 
        }
    }
    
