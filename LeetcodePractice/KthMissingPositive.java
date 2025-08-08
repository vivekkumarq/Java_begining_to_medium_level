package LeetcodePractice;

public class KthMissingPositive {
    public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;  
        int current = 1;      
        int index = 0;    

        while (true) {
            if (index < arr.length && arr[index] == current) {
             
                index++;
            } else {
            
                missingCount++;
                if (missingCount == k) {
                    return current; 
                }
            }
            current++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println(findKthPositive(arr1, k1));

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println(findKthPositive(arr2, k2)); 
    }
}

