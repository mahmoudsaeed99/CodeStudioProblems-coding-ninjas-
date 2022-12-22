import java.util.*;

public class Anagram_Substring_Search {
    public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
        ArrayList<Integer> a = new ArrayList<>();
        Map<Character , Integer> p = new HashMap<>();

        for (int i = 0 ; i < m ; i++){
            p.put(ptn.charAt(i) , p.getOrDefault(ptn.charAt(i) , 0) +1 );
        }

        System.out.println(p);
        return a;
    }

    public static void main(String[] args) {
        String str = "CBAEBABACD";
        String ptn = "ABC";
        ArrayList<Integer> r = findAnagramsIndices(str,ptn,str.length() ,ptn.length());
    }
}
