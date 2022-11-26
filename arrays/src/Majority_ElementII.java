import java.util.ArrayList;
import java.util.HashMap;

public class Majority_ElementII {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = arr.size() / 2;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0 ; i < arr.size() ; i++){
            h.put(arr.get(i) , h.getOrDefault(arr.get(i),0)+1);

        }
        for (int i : h.keySet()){
            if (h.get(i) >n){
                a.add(i);
            }
        }

        return a;
    }
    public static void main(String[] args) {

    }
}
