package Java_DailyLearningPractice;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(58);
        set.add(87);
        set.add(17);
        set.add(36);
        set.add(67);
        System.out.println("the set is " + set);

        //there is one more collection TreeSet ,it sorts and also contains the properties
        //of Set

        Set<Integer> hset = new TreeSet<>();
        hset.add(54);
        hset.add(12);
        hset.add(5);
        hset.add(3);
        hset.add(91);
        System.out.println("hashset is as following" + hset);
        
    }
    
}
