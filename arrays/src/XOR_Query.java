import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Arrays;

public class XOR_Query {
    public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < queries.size(); i++){
            int x1 = queries.get(i).get(0);
            int x2 = queries.get(i).get(1);
            if(x1 == 1){
                arr.add(x2);
            }
            else{
                for(int j = 0 ; j < arr.size() ; j++){
                    int t = arr.get(j) ^ x2;
                    arr.remove(j);
                    arr.add(j,t);
                }
            }
        }


        return arr;
    }
    public static void main(String[] args) {
    }
}
