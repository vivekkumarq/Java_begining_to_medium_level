package LeetcodePractice;
public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                result = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        

        int x1 = 4;
        System.out.println("Square root of " + x1 + " is: " + mySqrt(x1));

        int x2 = 8;
        System.out.println("Square root of " + x2 + " is: " + mySqrt(x2));

        int x3 = 2147395600;
        System.out.println("Square root of " + x3 + " is: " + mySqrt(x3));
    }
    
}
