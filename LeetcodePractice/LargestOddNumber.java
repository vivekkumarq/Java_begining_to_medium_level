package LeetcodePractice;
public class LargestOddNumber {
    public static String largestOddNumber(String num) {
    
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) { 
                return num.substring(0, i + 1);
            }
        }
       
        return "";
    }

    public static void main(String[] args) {
        String num1 = "52";
        System.out.println(largestOddNumber(num1)); 
      

        String num2 = "4206";
        System.out.println(largestOddNumber(num2)); 
   

        String num3 = "35427";
        System.out.println(largestOddNumber(num3)); 
        
    }
}
    

