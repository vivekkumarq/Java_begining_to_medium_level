package LeetcodePractice;

public class CountGoodTriplets {
     public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < n; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 1, 9, 7};
        int a1 = 7, b1 = 2, c1 = 3;
        System.out.println(countGoodTriplets(arr1, a1, b1, c1));

        int[] arr2 = {1, 1, 2, 2, 3};
        int a2 = 0, b2 = 0, c2 = 1;
        System.out.println(countGoodTriplets(arr2, a2, b2, c2)); 
    }
}
