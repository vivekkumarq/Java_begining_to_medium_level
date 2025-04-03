import java.util.ArrayList;
import java.util.List;

public class KidsWithCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;

        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandy);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    
}
