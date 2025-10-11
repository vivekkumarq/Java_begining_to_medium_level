package LeetcodePractice;

public class DistanceBetweenArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        
        for (int num1 : arr1) {
            boolean isValid = true;
            
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d)); 

        int[] arr3 = {1, 4, 2, 3};
        int[] arr4 = {-4, -3, 6, 10, 20, 30};
        System.out.println(findTheDistanceValue(arr3, arr4, 3));  

        int[] arr5 = {2, 1, 100, 3};
        int[] arr6 = {-5, -2, 10, -3, 7};
        System.out.println(findTheDistanceValue(arr5, arr6, 6)); 
    }
}
