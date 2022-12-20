public class NonDecreasing_Array {
    public static boolean isPossible(int[] arr, int n) {
        if(n <= 1){
            return true;
        }
        int c = 0;
        for (int i = 0 ; i < n-1 ; i++){
            if(arr[i+1] - arr[i] < 0){
                if(i == 0){
                    arr[i] = arr[i+1];
                }
                else{
                    if(arr[i+1] < arr[i-1]){
                        arr[i+1] = arr[i];
                    }else{
                        arr[i] = arr[i-1];
                    }
                }
                c++;
            }
            if(c > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        int[] arr = new int[]{-88, -77, -57, -54 ,-41 ,2 ,212, -157 ,34 ,68};
//        int[] arr = new int[]{-2, 7, -1 ,0 ,1, 2};
        int[] arr = new int[]{8,4,6};
        boolean bool = isPossible(arr , arr.length);
        System.out.println(bool);
    }
}
