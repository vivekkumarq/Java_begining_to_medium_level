package LeetcodePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
     public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1, carry = k;
        while (i >= 0 || carry > 0) {
            if (i >= 0) carry += num[i--];
            result.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,0,0};
        System.out.println(addToArrayForm(num1, 34));
        int[] num2 = {2,7,4};
        System.out.println(addToArrayForm(num2, 181));
        int[] num3 = {2,1,5};
        System.out.println(addToArrayForm(num3, 806));
    }
}
