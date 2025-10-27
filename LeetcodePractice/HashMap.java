package LeetcodePractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashMap {
      private static final int SIZE = 1000;

  
    private List<Entry>[] table;

    
    public void MyHashMap() {
        table = new List[SIZE];
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
        return key % SIZE;
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
        HashMap myHashMap = new HashMap();

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
