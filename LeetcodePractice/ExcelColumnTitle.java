package LeetcodePractice;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char ch = (char) (remainder + 'A');
            sb.append(ch);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

   
    public static void main(String[] args) {
        System.out.println(convertToTitle(1)); 
        System.out.println(convertToTitle(28));  
        System.out.println(convertToTitle(701)); 
        System.out.println(convertToTitle(52));   
        System.out.println(convertToTitle(2147483647)); 
    }
}

