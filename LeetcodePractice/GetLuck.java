package LeetcodePractice;

public class GetLuck {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = 0;
            for (char c : num.toString().toCharArray()) {
                result += c - '0';
            }
            num = new StringBuilder(String.valueOf(result));
        }
        return result;
    }

    public static void main(String[] args) {
        GetLuck sol = new GetLuck();
        System.out.println(sol.getLucky("iiii", 1)); 
        System.out.println(sol.getLucky("leetcode", 2)); 
        System.out.println(sol.getLucky("zbax", 2)); 
    }
}
