import java.util.ArrayList;
import java.util.Arrays;

public class Minimum_Number_of_Platforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
//        if (n == 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//        }
//        ArrayList<Integer> l = new ArrayList<>();
//        int p = 1;
//        l.add(dt[0]);
//        for (int i = 1 ; i < n ; i++){
//            for (int j = 0 ; j < l.size() ; j++){
//                if(at[i] > l.get(j)){
//                    l.remove(j);
//                    j--;
//                }
//            }
//            l.add(dt[i]);
//            p = l.size() > p ? l.size() : p;
//        }
//        return p;
        Arrays.sort(at);
        Arrays.sort(dt);
        int i = 1;
        int j = 0;
        int need = 1;
        int max = 1;
        while(i<n && j<n){
            if(at[i] <= dt[j]){
                need++;
                i++;
            }
            else if(at[i] > dt[j]){
                need--;
                j++;
            }
            max = Math.max(max, need);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] at = new int[]{775, 494, 252, 1680 };
        int[] dt = new int[]{2052, 2254, 1395 ,2130};
        int p = calculateMinPatforms(at,dt,at.length);
        System.out.println(p);

    }
}
