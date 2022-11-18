import java.util.ArrayList;
import java.util.Arrays;

public class Pair_Sum {
    public static int[][] pairSum(int[] arr, int s) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i =0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == s){
                    l.add(arr[i]);
                    l.add(arr[j]);

                }
            }
        }
        int[][] a = new int[l.size()/2][2];
        for (int i = 0 ; i < a.length ; i++){
            a[i][0] = l.get(i*2);
            a[i][1] = l.get(i*2 + 1);
        }
        return a;
    }
    public static void main(String[] args) {
//        int[][] a = new int[3][2];

        int[] arr = new int[]{1,2,3,4,5};
        int[][] a = pairSum(arr,5);
        for (int i = 0 ; i <a.length ; i++){
            System.out.println(a[i][0]+"   "+a[i][1]);
        }
    }

}
