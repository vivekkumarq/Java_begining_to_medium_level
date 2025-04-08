package LeetcodePractice;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result= result ^ num; //XOR operations is used
        }
        return result;
    }

    public static void main(String[] args) {
        

        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); 

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); 

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3)); 
    }
    
}
