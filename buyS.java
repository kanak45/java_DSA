package Functions1.DataDtructure;

public class buyS {
    public static int buySellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
       for(int i = 0; i<price.length; i++){
        if(buyPrice < price[i]) {
            int profit = price[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        } else {
            buyPrice = price[i];
        }
       }
       return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {4,6,4,2,1,3};
    }
}
