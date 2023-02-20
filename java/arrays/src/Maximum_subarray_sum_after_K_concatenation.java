import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_subarray_sum_after_K_concatenation {
    static int max_sub(ArrayList<Integer> arr, int n, int k){
        ArrayList<Integer> ll = new ArrayList<>();
//        boolean negative = true;
        for (int i = 0 ; i < n*k ; i++){
            ll.add(arr.get(i%n));

        }
        System.out.println(ll);
        int sum = 0;
        int max = -Integer.MAX_VALUE;
        for (int i = 0 ; i < ll.size() ; i++){
            sum += ll.get(i);
            if(sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-17 ,-278 ,-38 ,-4 ,-5 ,-67));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,3));
//        System.out.println(max_sub(arr1 , 5,3));
        System.out.println(max_sub(arr1 , arr1.size(),7));
//        System.out.println(0%5);
//        System.out.println(-Integer.MAX_VALUE);
//        System.out.println(1%5);
//        System.out.println(2%5);
//        System.out.println(3%5);
//        System.out.println(4%5);
    }
}
