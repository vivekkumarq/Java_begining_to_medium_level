package LeetcodePractice;
public class StockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int cash = 0;            
        int hold = -prices[0];    

        for (int i = 1; i < n; i++) {
            
            cash = Math.max(cash, hold + prices[i] - fee);
           
            hold = Math.max(hold, cash - prices[i]);
        }

        return cash;
    }

    public static void main(String[] args) {
        StockWithTransactionFee solution = new StockWithTransactionFee();

        int[] prices1 = {1, 3, 2, 8, 4, 9};
        int fee1 = 2;
        System.out.println(solution.maxProfit(prices1, fee1));  

        int[] prices2 = {1, 3, 7, 5, 10, 3};
        int fee2 = 3;
        System.out.println(solution.maxProfit(prices2, fee2));  
    }
}

