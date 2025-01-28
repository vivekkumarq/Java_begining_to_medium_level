import java.util.ArrayDeque;

public class ArrayDequeCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //ArrayDeque allow operation form both the ends
        adq.offer(54);
        adq.offer(87);
        adq.offer(23);
        adq.offer(47);
        System.out.println("ArrayDeque is " + adq);

        //also we can add elemetn in first
        adq.offerFirst(53);
        System.out.println("ArrayDeque is " + adq);
    }
    
}
