package LeetcodePractice;

public class ReplaceElementsWithGreatestOnRight {

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1; 

      
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];   
            arr[i] = maxRight;     
            maxRight = Math.max(maxRight, current); 
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {17, 18, 5, 4, 6, 1};
        int[] result1 = replaceElements(arr1);
        System.out.print("Output: ");
        for (int num : result1) System.out.print(num + " ");
    1

        System.out.println();

        int[] arr2 = {400};
        int[] result2 = replaceElements(arr2);
        System.out.print("Output: ");
        for (int num : result2) System.out.print(num + " ");
 
    }
}
