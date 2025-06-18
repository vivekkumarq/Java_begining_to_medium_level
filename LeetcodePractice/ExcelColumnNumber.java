package LeetcodePractice;

public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1; 
            result = result * 26 + value;
        }
        return result;
    }

   
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));   
        System.out.println(titleToNumber("AB"));   
        System.out.println(titleToNumber("ZY"));  
        System.out.println(titleToNumber("FXSHRXW"));
    }
}

