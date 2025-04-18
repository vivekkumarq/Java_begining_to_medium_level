package LeetcodePractice;
public class LongestSubarrayAfterDeletingOne {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLength = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

          
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

           
            maxLength = Math.max(maxLength, right - left);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarrayAfterDeletingOne sol = new LongestSubarrayAfterDeletingOne();

        System.out.println(sol.longestSubarray(new int[]{1, 1, 0, 1})); 
        System.out.println(sol.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1})); 
        System.out.println(sol.longestSubarray(new int[]{1, 1, 1}));
    }
}
