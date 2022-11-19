import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Arrays.sort(arr);
        int l = 1;
        int maxl = 1;
        for (int i = 1 ; i < N ; i++){
            int v = arr[i] - arr[i-1];
            if(v == 1){
                l++;
            }else if (v != 0){
                l =1;
            }
            maxl = maxl>l?maxl:l;
        }
        return maxl;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{33 ,20 ,34 ,30 ,35};
        int l = lengthOfLongestConsecutiveSequence(arr , arr.length);
        System.out.println(l);
    }
}
