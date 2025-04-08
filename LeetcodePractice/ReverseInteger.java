package LeetcodePractice;

public class ReverseInteger {
    public static int reverse(int x){
        int reverse = 0;

        while(x!=0)
        {
            int digit = x % 10;
            x=x/10;
            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE /10 && digit >7))
            {
                return 0;
            }
        
        if(reverse < Integer.MIN_VALUE /10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8))
        {
            return 0;
        }
        reverse = reverse * 10 + digit;
    }
    return reverse;   
}

 public static void main(String[] args) {
    int x1 =123;
    System.out.println("Reversed: " + reverse(x1));
    int x2= -123;
    System.out.println("Reverse: " + reverse(x2));
 }
}
