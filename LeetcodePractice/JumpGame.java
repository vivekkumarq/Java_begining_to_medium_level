package LeetcodePractice;
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false; 
            reachable = Math.max(reachable, i + nums[i]);
            if (reachable >= nums.length - 1) return true;
        }

        return true;
    }

 
    public static void main(String[] args) {

        System.out.println(canJump(new int[]{2,3,1,1,4})); 
        System.out.println(canJump(new int[]{3,2,1,0,4})); 
    }
    
}
