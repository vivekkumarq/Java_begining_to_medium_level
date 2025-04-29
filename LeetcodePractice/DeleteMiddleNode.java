package LeetcodePractice;
public class DeleteMiddleNode {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head, prev = null;

 
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

   
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
      
        int[] input1 = {1, 3, 4, 7, 1, 2, 6};
        ListNode head1 = createList(input1);
        System.out.print("Original: ");
        printList(head1);
        head1 = deleteMiddle(head1);
        System.out.print("After deletion: ");
        printList(head1);


        int[] input2 = {1, 2, 3, 4};
        ListNode head2 = createList(input2);
        System.out.print("\nOriginal: ");
        printList(head2);
        head2 = deleteMiddle(head2);
        System.out.print("After deletion: ");
        printList(head2);

    
        int[] input3 = {2, 1};
        ListNode head3 = createList(input3);
        System.out.print("\nOriginal: ");
        printList(head3);
        head3 = deleteMiddle(head3);
        System.out.print("After deletion: ");
        printList(head3);
    }
}
