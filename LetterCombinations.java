import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
        private static final String[] keyPad = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        doBacktracking(result, new StringBuilder(), digits, 0);
        return result;
    }

    private static void doBacktracking(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = keyPad[digits.charAt(index) - '0']; 
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            doBacktracking(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        
        System.out.println(letterCombinations("23")); 
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2")); 
    }
}
