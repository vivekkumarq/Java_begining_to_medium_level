package LeetcodePractice;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        HighestAltitude sol = new HighestAltitude();

        System.out.println(sol.largestAltitude(new int[]{-5, 1, 5, 0, -7})); 
        System.out.println(sol.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); 
    }
}
