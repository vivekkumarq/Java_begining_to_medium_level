package LeetcodePractice;
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }

        
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        long result = 0;

        
        while (lDividend >= lDivisor) {
            long temp = lDivisor;
            long multiple = 1;

            while (lDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            
            lDividend -= temp;
            result += multiple;
        }

    
        result = sign * result;

        
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        

        System.out.println(divide(10, 3)); 
        System.out.println(divide(7, -3));
        System.out.println(divide(-2147483648, -1)); 
    }
    
}
