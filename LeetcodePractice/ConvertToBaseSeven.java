package LeetcodePractice;

public class ConvertToBaseSeven {
      public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean negative = num < 0;
        num = Math.abs(num);
        
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (negative) sb.append("-");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ConvertToBaseSeven sol = new ConvertToBaseSeven();
        System.out.println(sol.convertToBase7(100));  
        System.out.println(sol.convertToBase7(-7));   
        System.out.println(sol.convertToBase7(0));   
    }
}
