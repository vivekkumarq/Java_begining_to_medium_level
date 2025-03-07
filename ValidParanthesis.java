import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> storeStack = new Stack<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) { 
                char topmostCharacter = storeStack.isEmpty() ? '#' : storeStack.pop(); 
                if (topmostCharacter != map.get(ch)) {
                    return false; 
                }
            } else {
                storeStack.push(ch); 
            }
        }
        return storeStack.isEmpty(); 
    }

    public static void main(String[] args) {
        
        System.out.println(isValid("()"));     
        System.out.println(isValid("()[]{}"));  
        System.out.println(isValid("(]"));     
        System.out.println(isValid("([)]"));    
        System.out.println(isValid("{[]}"));    
    }
    
}
