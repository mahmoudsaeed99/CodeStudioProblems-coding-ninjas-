import java.util.ArrayList;
import java.util.Arrays;

public class First_and_LastPosition_of_anelement_in_SortedArray {
    public static void main(String[] args) {


        int x = 2;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3));
        int n = arr.size();
        int start = 0;

        int end = arr.size() - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(x < arr.get(mid)){
                end = mid;
            }
            else if(x > arr.get(mid)){
                start = mid +1;
            }
            else{
                index  = mid;
                break;
            }
        }
        int first = index;
        int last = index;
        while(first > 0){
            if(arr.get(first - 1) == arr.get(index)){
                first--;
            }
            else{
                break;
            }
        }
        while(last < n-1){
            if(arr.get(last + 1) == arr.get(index)){
                last++;
            }
            else{
                break;
            }
        }
        System.out.println(first+"   "+last);


    }
}
