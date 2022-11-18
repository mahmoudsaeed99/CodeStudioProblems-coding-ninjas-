import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Max_Product_Count {
    public static long[] maxProductCount(int arr[], int n) {
        long[] a = new long[2];
//        Dictionary<Integer, Integer> dict
//                = new Hashtable<Integer, Integer>();
        Dictionary dict = new Hashtable();
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                long k =(long) arr[i] * arr[j];
                if(dict.get(k) != null){
                    long x = (long) dict.get(k);
                    dict.put(k , x + (long) 1 );
                }else{
                    dict.put(k , (long) 1);
                }
            }
        }
        long maxVal = -1;
        long maxKey = 0;
        for(Enumeration enm = dict.keys(); enm.hasMoreElements();)
        {
            long key = (long) enm.nextElement();
            if((long)dict.get(key) > maxVal){
                maxVal =  (long)dict.get(key);
                maxKey = key;
            } else if ((long)dict.get(key) == maxVal) {
                maxVal =  (long)dict.get(key);
                maxKey = maxKey < key ? maxKey:key;
            }
        }
        if(maxVal > 1){
            a[0] = (long) maxKey;
            a[1] = (maxVal * (maxVal - 1) /2);
        }else{
            a[0] = 0;
            return new long[]{a[0]};
        }


        return a;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{100000000 ,200, 200000000 ,100 ,9 ,40000000, 500};
        long[] a = maxProductCount(arr , arr.length);
        System.out.println(Arrays.toString(a));
    }
}
