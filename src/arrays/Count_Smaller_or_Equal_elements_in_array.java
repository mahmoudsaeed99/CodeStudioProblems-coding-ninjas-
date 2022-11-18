import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Count_Smaller_or_Equal_elements_in_array {
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        // Write your code here!
        List<Integer> l = new ArrayList<>();
        Arrays.sort(b);
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = m-1 ; j >=0 ; j--){
                if(a[i]>=b[j]){
                    break;
                }
                else{
                    count++;
                }
            }
            l.add(m-count);
        }
        return l;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1 ,0 ,0};
        int[] b = new int[]{-1,0,0};
        List<Integer> l = new ArrayList<>();
        l = countSmallerOrEqual(a , b , a.length , b.length);
        System.out.println(l.toString());
    }
}
