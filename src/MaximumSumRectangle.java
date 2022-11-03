public class MaximumSumRectangle {
    static int maximumSub(int[] arr , int maxSum ) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }
    static int[] addArrays(int[] arr1 , int[] arr2){
        int[] newArr = new int[arr1.length];
        for (int i = 0 ; i< arr1.length ; i++){
            newArr[i] = arr1[i] + arr2[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = -1;
        arr[0][1] = 1;
        arr[1][0] = 2;
        arr[1][1] = 2;
        int n = 2;
        int m = 2;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ;i++){
            int[] a = new int[m];
            a = arr[i];
            max = maximumSub(a , max);
            for (int j = i+1 ; j < n ; j++){
                a = addArrays(a , arr[j]) ;
                max = maximumSub(a , max);
            }
        }
        System.out.println(max);
    }
}
