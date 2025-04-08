package Java_DailyLearningPractice;
import java.util.ArrayList;
import java.util.*;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Raju");
        studentsName.add("Raman");
        //So we can add as many as names in studentsName as its dynamic
        System.out.println("Here is list of students name" + studentsName);

        //now if we want to add any element to particular position of list,for example second postition
        studentsName.add(2, "kamal");
        System.out.println("New updated list" + studentsName);

        //we can also use List instead of Arraylist
        List<Integer> age = new ArrayList<>();
        age.add(67);
        age.add(72);
        age.add(2,88);
        System.out.println("age List" + age);

        //we can also add new list to existing List
        List<Integer> newList = new ArrayList<>();
        newList.add(90);
        newList.add(12);
        newList.add(13);
        newList.add(16);
        newList.add(19);
        age.addAll(newList);
        System.out.println("Conecanating the list" + age);

        System.out.println("to fetch elements " + age.get(4));

        //to remove some elements
        System.out.println("to remove element" + age.remove(3));

        //if we want to remove by elements not by index
        System.out.println("to remove by elements" + age.remove(Integer.valueOf(90)) + age);

        //Some Iterating ways
        //normal for-loop
        for (int i = 0; i< newList.size();i++){
                System.out.println("the element is " + newList.get(i));
        }
        //another way by for each
        for (Integer element : newList) {
            System.out.println("the element is with foreach way " + element);
            
        }

        //Iterator way
        Iterator<Integer> it = newList.iterator();
        while(it.hasNext()){
            System.out.println("Iterator " + it.next());
        }
        
    }
}