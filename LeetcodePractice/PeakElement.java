package LeetcodePractice;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        
        return left; 
    }

    public static void main(String[] args) {
        PeakElement solver = new PeakElement();
        System.out.println(solver.findPeakElement(new int[]{1, 2, 3, 1})); 
        System.out.println(solver.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4})); 
    }
}

