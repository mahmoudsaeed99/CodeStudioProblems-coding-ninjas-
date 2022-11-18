import java.util.ArrayList;
import java.util.List;

public class Sum_Of_Infinite_Array {
    public static int mod = 99999999;
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> l = new ArrayList<>();
        int x = 0, sum;
        int prefix[] = new int[n + 1];
        prefix[0] = 0;
        // Calculate the prefix sum
        for (int j = 1; j <= n; j++) {
            prefix[j] = (prefix[j - 1] + arr[j - 1])%mod;
        }
        for (int i = 0; i < queries.size(); i++) {
            Long L = (queries.get(i).get(0));

            Long R = (queries.get(i).get(1));
            // Stores the sum of elements
            // from 1 to L-1
            Long leftsum
                    = (((L - 1) / n)%mod * prefix[n] + prefix[(int) ((L - 1) % n)])%mod;

            // Stores the sum of elements
            // from 1 to R
            Long rightsum = ((R / n)%mod * prefix[n] + prefix[(int) (R % n)])%mod;
            int res = (int) (rightsum - leftsum + mod) %mod;
            l.add(res);
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,6,9};
        int n = arr.length;
        List<List<Long>> queries = new ArrayList<>();
        List<Long> query1 = new ArrayList<>();
        List<Long> query2 = new ArrayList<>();
        query1.add(10L);
        query1.add(13L);
        query2.add(7L);
        query2.add(11L);
        queries.add(query1);
        queries.add(query2);
        int q = queries.size();
        List<Integer> l = new ArrayList<>();
        l = sumInRanges(arr , n , queries , q);
        System.out.println(l.toString());
    }
}
