package LeetcodePractice;
import java.util.PriorityQueue;
import java.util.HashSet;

import java.util.*;

class SmallestInfiniteSet {
    private int current;
    private PriorityQueue<Integer> addedBack;
    private HashSet<Integer> inHeap;

    public SmallestInfiniteSet() {
        current = 1;
        addedBack = new PriorityQueue<>();
        inHeap = new HashSet<>();
    }

    public int popSmallest() {
        if (!addedBack.isEmpty()) {
            int smallest = addedBack.poll();
            inHeap.remove(smallest);
            return smallest;
        } else {
            return current++;
        }
    }

    public void addBack(int num) {
        if (num < current && !inHeap.contains(num)) {
            addedBack.offer(num);
            inHeap.add(num);
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);                          
        System.out.println(smallestInfiniteSet.popSmallest());   
        System.out.println(smallestInfiniteSet.popSmallest());  
        System.out.println(smallestInfiniteSet.popSmallest());   
        smallestInfiniteSet.addBack(1);                          
        System.out.println(smallestInfiniteSet.popSmallest());   
        System.out.println(smallestInfiniteSet.popSmallest());   
        System.out.println(smallestInfiniteSet.popSmallest());  
    }
}


