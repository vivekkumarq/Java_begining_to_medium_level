package Java_DailyLearningPractice;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueCollection {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        //for adding any element in queue
        queue.offer(87);
        queue.offer(81);
        queue.offer(92);
        queue.offer(97);
        queue.offer(33);
        queue.offer(51);
        System.out.println("the queue elements are " + queue);

        //for removing elements from queue
        System.out.println("removed elemt " + queue.poll());
        System.out.println("updated queue" + queue);
    }
    
}
