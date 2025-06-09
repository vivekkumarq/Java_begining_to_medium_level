package LeetcodePractice;

public class BitwiseFlipCounter {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        for (int i = 0; i < 32; i++) {
            int aBit = (a >> i) & 1;
            int bBit = (b >> i) & 1;
            int cBit = (c >> i) & 1;

            int orBit = aBit | bBit;

            if (orBit != cBit) {
                if (cBit == 1) {
                    
                    flips += 1;
                } else {
                    
                    flips += aBit + bBit;
                }
            }
        }
        return flips;
    }

    public static void main(String[] args) {
        BitwiseFlipCounter solution = new BitwiseFlipCounter();
        System.out.println(solution.minFlips(2, 6, 5)); 
        System.out.println(solution.minFlips(4, 2, 7)); 
        System.out.println(solution.minFlips(1, 2, 3)); 
    }
}

