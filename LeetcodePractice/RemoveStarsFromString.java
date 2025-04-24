package LeetcodePractice;

public class RemoveStarsFromString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveStarsFromString solution = new RemoveStarsFromString();

        String s1 = "leet**cod*e";
        System.out.println(solution.removeStars(s1)); 

        String s2 = "erase*****";
        System.out.println(solution.removeStars(s2)); 
    }
}
