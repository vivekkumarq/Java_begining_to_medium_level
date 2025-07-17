package LeetcodePractice;

public class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
     
        String digits = number.replaceAll("[\\s-]", "");
        StringBuilder result = new StringBuilder();

        int i = 0;
        int n = digits.length();

        while (n - i > 4) {
            result.append(digits.substring(i, i + 3)).append("-");
            i += 3;
        }

        int remaining = n - i;
        if (remaining == 4) {
            result.append(digits.substring(i, i + 2)).append("-");
            result.append(digits.substring(i + 2, i + 4));
        } else if (remaining == 3) {
            result.append(digits.substring(i, i + 3));
        } else if (remaining == 2) {
            result.append(digits.substring(i, i + 2));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String number1 = "1-23-45 6";
        System.out.println(reformatNumber(number1)); 
        

        String number2 = "123 4-567";
        System.out.println(reformatNumber(number2)); 
      

        String number3 = "123 4-5678";
        System.out.println(reformatNumber(number3)); 
       
    }
}

