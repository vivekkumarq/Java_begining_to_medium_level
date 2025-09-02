package LeetcodePractice;

public class SlowestKeyPress {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int maxDuration = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for (int i = 1; i < n; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > result)) {
                maxDuration = duration;
                result = keysPressed.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{9,29,49,50}, "cbcd")); 
        System.out.println(slowestKey(new int[]{12,23,36,46,62}, "spuda")); 
    }
}

