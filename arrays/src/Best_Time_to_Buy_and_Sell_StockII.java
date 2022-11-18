public class Best_Time_to_Buy_and_Sell_StockII {
    public static long getMaximumProfit (int n, long[] values) {
        // Your code goes here.
        if(n == 0){
            return 0;
        }
        long max_proit = 0;

        long buy = values[0];
        long sell = values[0];
        long p = 0;
        for (int i = 1 ; i < values.length ; i++){
            if(values[i] - buy > p){
                p = values[i] - buy;
            }
            if(values[i] < sell){
                max_proit +=p;
                p = 0;
                buy = values[i];
                sell = values[i];
            }else{
                sell = values[i];
            }
        }
        max_proit +=p;
        return max_proit;
    }
    public static void main(String[] args) {
        long[] val = new long[]{100 ,50 ,30 ,20};
        int n = val.length;
        long profit = getMaximumProfit(n , val);
        System.out.println(profit);
    }
}
