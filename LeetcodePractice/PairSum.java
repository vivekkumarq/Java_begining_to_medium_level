package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    
        public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();

        
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

       
        int maxSum = 0;
        int n = values.size();
        for (int i = 0; i < n / 2; i++) {
            int twinSum = values.get(i) + values.get(n - 1 - i);
            maxSum = Math.max(maxSum, twinSum);
        }

        return maxSum;
    }

    
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    
    public static void main(String[] args) {
        int[] input = {5, 4, 2, 1};  
        ListNode head = createList(input);

        PairSum ps = new PairSum();
        int result = ps.pairSum(head);

        System.out.println("Maximum Twin Sum: " + result);  
    }
}
