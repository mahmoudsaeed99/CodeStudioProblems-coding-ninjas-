import java.util.*;

//link problem :
//        https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376580

public class Maximum_of_All_Subarrays_of_Size_K {
    public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int N, int K) {
        List<Integer> l = new ArrayList<>(){};
        Deque<Integer> Qi = new LinkedList<>();

        int i;
        for (i = 0; i < K; ++i) {

           while (!Qi.isEmpty()
                    && arr[i] >= arr[Qi.peekLast()])

                Qi.removeLast();

            Qi.addLast(i);
        }
        System.out.println(Qi);
        for (; i < N; ++i) {
            l.add(arr[Qi.peek()]);
             System.out.print(arr[Qi.peek()] + " ");

            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();

            while ((!Qi.isEmpty())
                    && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }
        l.add(arr[Qi.peek()]);
//        System.out.print(arr[Qi.peek()]);
        return l;
    }
    public static void main(String[] args) {

        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int K = 3;
        List<Integer> l = maximumInAllSubarraysOfSizeK(arr, arr.length, K);
        System.out.println(l);
    }
}
