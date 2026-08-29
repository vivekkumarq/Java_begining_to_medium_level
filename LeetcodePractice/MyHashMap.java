package LeetcodePractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// LeetCode 706 - Design HashMap. named MyHashMap so it does not hide java.util.HashMap
// put/get/remove average O(1), space O(n)
public class MyHashMap {
      private static final int SIZE = 1000;

  
    @SuppressWarnings("unchecked")
    private final List<Entry>[] table = new List[SIZE];

    
    public MyHashMap() {
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    
    private static class Entry {
        int key, value;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

   
    private int hash(int key) {
        return Math.floorMod(key, SIZE);
    }


    public void put(int key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value)); 
    }

    
    public int get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; // Key not found
    }


    public void remove(int key) {
        int index = hash(key);
        Iterator<Entry> iterator = table[index].iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            if (entry.key == key) {
                iterator.remove();
                return;
            }
        }
    }


    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(1, 1); 
        myHashMap.put(2, 2);
        System.out.println(myHashMap.get(1)); 
        System.out.println(myHashMap.get(3)); 
        myHashMap.put(2, 1); 
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2); 
        System.out.println(myHashMap.get(2)); 
    }
    
}
