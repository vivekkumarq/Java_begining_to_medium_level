public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);

        return result;
    }

  
    private static int findStartingIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int start = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    start = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return start;
    }

   
    private static int findEndingIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int end = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    end = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
      

        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        System.out.println(java.util.Arrays.toString(searchRange(nums1, target1))); 

        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;
        System.out.println(java.util.Arrays.toString(searchRange(nums2, target2))); 

        int[] nums3 = {};
        int target3 = 0;
        System.out.println(java.util.Arrays.toString(searchRange(nums3, target3)));
    }
    
}
