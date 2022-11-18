import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Form_aTriangle {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12 ,3 ,7 ,4 ,28));
        System.out.println(arr.get(0));
        Collections.sort(arr);
        boolean bool =false;
        for (int i = 0 ; i < arr.size()-2 ; i++){
            if(arr.get(i) + arr.get(i+1) > arr.get(i+2)){
                bool = true;
                break;
            }
        }
        if(bool){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
