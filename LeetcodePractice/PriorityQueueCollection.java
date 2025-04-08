package LeetcodePractice;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(78);
        pq.offer(87);
        pq.offer(12);
        pq.offer(22);
        pq.offer(58);
        System.out.println(pq);

        System.out.println("check priority " + pq.poll());
        System.out.println("update pq" + pq);

    }
    
}
