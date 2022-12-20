public class FlibBits {
    public static void main(String[] args) {
        int ones = 0;
        int sum = 0;
        int max = 0;
        int[] arr = new int[]{1,0,0,1,0};
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                ones++;
            }
            int v = arr[i] == 1?-1:1;
            sum += v;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max + ones);
    }
}
