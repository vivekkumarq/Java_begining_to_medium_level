package LeetcodePractice;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = getMax(piles);
        int result = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hours = totalHours(piles, mid);
            
            if (hours <= h) {
                result = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return result;
    }
    
    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
    
    private int totalHours(int[] piles, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; 
        }
        return hours;
    }

    public static void main(String[] args) {
        KokoEatingBananas solver = new KokoEatingBananas();
        System.out.println(solver.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)); 
        System.out.println(solver.minEatingSpeed(new int[]{30,11,23,4,20}, 5)); 
        System.out.println(solver.minEatingSpeed(new int[]{30,11,23,4,20}, 6)); 
    }
}

