package LeetcodePractice;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int numberOfBoxes = box[0];
            int unitsPerBox = box[1];

           
            if (truckSize >= numberOfBoxes) {
                totalUnits += numberOfBoxes * unitsPerBox;
                truckSize -= numberOfBoxes;
            } 
           
            else {
                totalUnits += truckSize * unitsPerBox;
                break;
            }
        }

        return totalUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes1 = {{1,3},{2,2},{3,1}};
        int truckSize1 = 4;
        System.out.println(maximumUnits(boxTypes1, truckSize1)); 

        int[][] boxTypes2 = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize2 = 10;
        System.out.println(maximumUnits(boxTypes2, truckSize2));
    }
}
