package LeetcodePractice;
public class Power {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        
        long power = n;
        if (n < 0) {
            x = 1 / x;
            power = -power;
        }
        
        double result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= x;
            }
            x *= x;
            power /= 2; 
        }
        
        return result;
    }

    public static void main(String[] args) {
        

        System.out.println(myPow(2.00000, 10)); 
        System.out.println(myPow(2.10000, 3)); 
        System.out.println(myPow(2.00000, -2)); 
    }
    
}
