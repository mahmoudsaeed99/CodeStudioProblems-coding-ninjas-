public class MaximumSubarraySum {
    public static void main(String[] args) {
        int sum = 0;
        int maxSum = -Integer.MAX_VALUE;
        int[] arr = new int[]{1,-2,-3,4,-1,2,1};
        int n = arr.length;
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
             if(sum > maxSum){
                 maxSum = sum;
                 end = i;
            }
            if(sum < 0){
                start = i+1;
                sum = 0;
            }
        }
        System.out.println(start+" to "+end+"    "+maxSum);
    }
}
