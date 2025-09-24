package LeetcodePractice;
class GenerateTheString {

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append("a".repeat(n - 1));
            sb.append("b");
        } else {
            sb.append("a".repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GenerateTheString sol = new GenerateTheString();
        System.out.println(sol.generateTheString(4)); 
        System.out.println(sol.generateTheString(2)); 
        System.out.println(sol.generateTheString(7)); 
    }
}
