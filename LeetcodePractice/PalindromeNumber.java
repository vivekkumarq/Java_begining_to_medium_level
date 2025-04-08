package LeetcodePractice;
public class PalindromeNumber{
    public static boolean isPalindrome(int x){
    int reverse = 0;
    int original = x;
    while(x>0){
        int digit = x%10;
        reverse = reverse*10 +digit;
        x=x/10;
    }
    return original == reverse;
}
public static void main(String[] args) {
    int x1=121;
    System.out.println("is this palindrome " + isPalindrome(x1));
    int x2 = 123;
    System.out.println("is this palindrome " + isPalindrome(x2));
}
}
