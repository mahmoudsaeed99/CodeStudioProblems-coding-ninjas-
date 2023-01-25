import java.util.HashMap;
import java.util.Map;

//link problem :
//        https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376582


public class Fruits_and_Baskets {
    public static int findMaxFruits(String str, int n) {
        Map<Character , Integer> m = new HashMap<>();
        int j = 0;
        int max = 0;
        int i = 0;
        for (; i < n ; i++){
            if (!m.containsKey(str.charAt(i)) && m.size() > 1){
                max = i-j > max ? i-j:max;
                while(j < i && m.size() > 1){
                    m.put(str.charAt(j),m.get(str.charAt(j))-1);
                    if (m.get(str.charAt(j)) == 0){
                        m.remove(str.charAt(j));
                    }
                    j++;
                }
            }
            m.put(str.charAt(i) , m.getOrDefault(str.charAt(i),0)+1);
        }
        max = i-j > max ? i-j:max;
        return max;
    }

    public static void main(String[] args) {
        String s = "AAAAB";
        int r = findMaxFruits(s , s.length());
        System.out.println(r);
    }
}
