import java.util.ArrayList;

public class Print_the_array_after_K_operations {
    public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {
        if(k==0){
            return arr;
        }
        k = k%2==0?2:1;
        int prevMax = Integer.MIN_VALUE;
        int newMax = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.size() ; i++){
            if (newMax < arr.get(i)){
                newMax = arr.get(i);
            }
        }
        while (k > 0){
            prevMax = newMax;
            newMax = Integer.MIN_VALUE;
            for (int i = 0 ; i < arr.size() ; i++){
                arr.add(i , prevMax - arr.get(i));
                arr.remove(i+1);
                newMax = arr.get(i) > newMax ? arr.get(i):newMax;
            }
            k--;
        }
        return arr;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);arr.add(0);arr.add(9);arr.add(18);
        ArrayList<Integer> a = printArrayAfterKOperations(arr,arr.size() , 3);
        System.out.println(a.toString());
    }
}
