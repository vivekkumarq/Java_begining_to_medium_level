    package LeetcodePractice;
    public class BalancedStringPlaced {
    public int balancedStringSplit(String s) {
        int balance = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') balance++;
            else balance--;
            if (balance == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        BalancedStringPlaced sol = new BalancedStringPlaced();
        System.out.println(sol.balancedStringSplit("RLRRLLRLRL")); 
        System.out.println(sol.balancedStringSplit("RLRRRLLRLL")); 
        System.out.println(sol.balancedStringSplit("LLLLRRRR"));   
    }
}
