
//Link : https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377989


import java.util.HashMap;

public class MinimumOperationsToMakeStringsEqual {
    public static int minimumOperations(String a, String b) {
        if(a.length() != b.length()){
            return -1;
        }
        else{
            int s = 0;
            int n = a.length();
            for (int i = 0 ; i < n/2 ; i++){
                HashMap<Character , Integer> m = new HashMap<>();
                m.put(a.charAt(i) , m.getOrDefault(a.charAt(i) , 0)+1);
                m.put(b.charAt(i) , m.getOrDefault(b.charAt(i) , 0)+1);
                m.put(a.charAt(n-i-1) , m.getOrDefault(a.charAt(n-i-1) , 0)+1);
                m.put(b.charAt(n-i-1), m.getOrDefault(b.charAt(n-i-1) , 0)+1);
                if (m.size() == 4){
                    s += 2;
                } else if (m.size() == 3) {
                    s += 1 + (a.charAt(i)==a.charAt(n-i-1)?1:0);
                } else if (m.size() == 2) {
                    s += (m.get(a.charAt(i))!=2?1:0);
                }

            }
            if ((n % 2 ==1) && (a.charAt(n/2) != b.charAt(n/2))){
                s += 1;
            }
            return s;
        }
    }

    public static void main(String[] args) {

    }
}
