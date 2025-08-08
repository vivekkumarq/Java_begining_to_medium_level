package LeetcodePractice;

public class BusShortestDistance {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
    
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clockwise = 0;
        int total = 0;

        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }
        }

        int counterClockwise = total - clockwise;
        return Math.min(clockwise, counterClockwise);
    }

    public static void main(String[] args) {
        int[] dist1 = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(dist1, 0, 1)); 

        int[] dist2 = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(dist2, 0, 2)); 

        int[] dist3 = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(dist3, 0, 3)); 
    }
}
