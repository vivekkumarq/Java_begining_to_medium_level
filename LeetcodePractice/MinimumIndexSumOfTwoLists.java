package LeetcodePractice;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1a = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2a = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant(list1a, list2a))); 

        String[] list1b = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2b = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1b, list2b))); 

        String[] list1c = {"happy","sad","good"};
        String[] list2c = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list1c, list2c))); 
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {
            String s = list2[j];
            if (map.containsKey(s)) {
                int sum = j + map.get(s);
                if (sum < minSum) {
                    result.clear();
                    result.add(s);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(s);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
