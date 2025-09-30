package LeetcodePractice;

public class ThousandSeperator {
     public String thousandSeparator(int n) {
        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            sb.append(num.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                sb.append('.');
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ThousandSeperator sol = new ThousandSeperator();
        System.out.println(sol.thousandSeparator(987));  
        System.out.println(sol.thousandSeparator(1234));  
        System.out.println(sol.thousandSeparator(1234567)); 
    }
}
