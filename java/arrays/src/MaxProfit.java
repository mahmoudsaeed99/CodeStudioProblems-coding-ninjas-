public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int n  = prices.length;
        if (n == 0){
            return 0;
        }
        int b = prices[0];
        int p = 0;
        for (int i = 1 ; i < n ; i++){
            if (p < (prices[i] - b)){
                p = (prices[i] - b);
            }else if (b >= prices[i]){
                b = prices[i];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[] val = new int[]{7,1,5,3,6,4};
        int profit = maxProfit(val);
        System.out.println(profit);
    }
}
