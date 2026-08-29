package LeetcodePractice;
import java.util.HashMap;
import java.util.Map;

// O(n) time, O(1) space. walk from the right, subtract when a smaller numeral sits before a bigger one
public class RomanToInteger {
    public static int romanToInt(String s){
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total=0;
        int previousValue =0;

        for(int i = s.length() -1;i>=0;i--){
            int currentValue = romanMap.get(s.charAt(i));

            if(currentValue<previousValue)
            {
                total = total - currentValue;
            }
            else{
                total = total + currentValue;
            }
            previousValue = currentValue;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    
}
