public class FlowerPlanting {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) return true;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        FlowerPlanting obj = new FlowerPlanting();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(obj.canPlaceFlowers(flowerbed, n)); 
    }
    
}
