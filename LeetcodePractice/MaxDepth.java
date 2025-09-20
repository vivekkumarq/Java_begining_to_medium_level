package LeetcodePractice;

public class MaxDepth {
    public int maxDepth(String s) {
        int depth = 0, maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        MaxDepth sol = new MaxDepth();
        System.out.println(sol.maxDepth("(1+(2*3)+((8)/4))+1")); 
        System.out.println(sol.maxDepth("(1)+((2))+(((3)))"));   
        System.out.println(sol.maxDepth("()(())((()()))"));      
    }
}
