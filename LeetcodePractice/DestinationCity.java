package LeetcodePractice;

import java.util.*;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> startingCities = new HashSet<>();
        
       
        for (List<String> path : paths) {
            startingCities.add(path.get(0));
        }
        
        
        for (List<String> path : paths) {
            String endCity = path.get(1);
            if (!startingCities.contains(endCity)) {
                return endCity;
            }
        }
        
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths1 = Arrays.asList(
            Arrays.asList("London","New York"),
            Arrays.asList("New York","Lima"),
            Arrays.asList("Lima","Sao Paulo")
        );
        System.out.println(destCity(paths1)); 

        List<List<String>> paths2 = Arrays.asList(
            Arrays.asList("B","C"),
            Arrays.asList("D","B"),
            Arrays.asList("C","A")
        );
        System.out.println(destCity(paths2)); 

        List<List<String>> paths3 = Arrays.asList(
            Arrays.asList("A","Z")
        );
        System.out.println(destCity(paths3)); 
    }
}
