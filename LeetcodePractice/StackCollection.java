package LeetcodePractice;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("Elephant");
        animals.push("Fox");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cheetah");
        animals.push("Horse");
        System.out.println("My Animals stack is " + animals);

        //for checking which element in stack is on top we use peek function
         System.out.println("topmost animal is " + animals.peek());

         //for removing we use pop function and it always remove topmost 
         System.out.println("Remove topmost " + animals.pop());
         System.out.println("final update stack is " + animals);
        
    }
    
}
