package LeetcodePractice;

public class GuessGame {
    private int pick; 

    public GuessGame(int pick) {
        this.pick = pick;
    }

    
    public int guess(int num) {
        if (num == pick) return 0;
        return num > pick ? -1 : 1;
    }

    public int guessNumber(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        GuessGame game1 = new GuessGame(6);
        System.out.println("Picked number is: " + game1.guessNumber(10)); 

        GuessGame game2 = new GuessGame(1);
        System.out.println("Picked number is: " + game2.guessNumber(1)); 

        GuessGame game3 = new GuessGame(1);
        System.out.println("Picked number is: " + game3.guessNumber(2)); 
    }
}

