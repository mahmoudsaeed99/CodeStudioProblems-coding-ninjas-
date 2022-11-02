public class MaximumSubarraySum {
    public static void main(String[] args) {
        int sum = 0;
        int maxSum = -1;
        int[] arr = new int[]{1,2,7,-4,3,2,-10,9,1};
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
