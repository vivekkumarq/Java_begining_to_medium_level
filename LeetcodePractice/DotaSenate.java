package LeetcodePractice;

import java.util.LinkedList;
import java.util.Queue;

public class DotaSenate {
   public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        
       
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        
        // Simulate the rounds
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            
            if (rIndex < dIndex) {
            
                radiant.offer(rIndex + n);
            } else {
                
                dire.offer(dIndex + n);
            }
        }
        
        return radiant.isEmpty() ? "Dire" : "Radiant";
    } 
    public static void main(String[] args) {
        

        String senate1 = "RD";
        System.out.println("Input: " + senate1);
        System.out.println("Winner: " + predictPartyVictory(senate1));
        System.out.println();


        String senate2 = "RDD";
        System.out.println("Input: " + senate2);
        System.out.println("Winner: " + predictPartyVictory(senate2));
        System.out.println();

 
        String senate3 = "RRDDD";
        System.out.println("Input: " + senate3);
        System.out.println("Winner: " + predictPartyVictory(senate3));
    }   
}
