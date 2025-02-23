public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
       int m = nums1.length;
       int n = nums2.length;

       int[] mergedArray = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n) {
            if(nums1[i] < nums2[j])
            {
                mergedArray[k++] = nums1[i++];
            }
            else
            {
                mergedArray[k++] = nums2[j++];
            }
            
        }

        while(i<m)
        {
            mergedArray[k++] =nums1[i++];
        }
        while (j<n) 
        {
            mergedArray[k++] = nums2[j++];
        }

        int len =mergedArray.length;
        if(len % 2 == 1)
        {
            return mergedArray[len/2];
        }
        else{
            return (mergedArray[len/2 -1] + mergedArray[len/2]) /2.0;
        }

    }

 public static void main(String[] args) {
    int[] nums1 = {1,3};
    int[] nums2 = {2};
    System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));
 }
    
}
