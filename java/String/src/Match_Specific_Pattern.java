import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Match_Specific_Pattern {
    public static String encode(String s){
        HashMap<Character , Integer> h = new HashMap<>();
        String new_s = "";
        int l = 0;
        for (int i = 0 ; i <s.length() ; i++){
            char c = s.charAt(i);
            if (!h.containsKey(c)){
                h.put(c , l++);
            }
            new_s += h.get(c);
        }
        return new_s;
    }
    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {
        List<String> s = new ArrayList<>();
        String p = encode(pattern);
        for (int i = 0 ; i < n ; i++){
            String h = encode(words.get(i));
            if(h.equals(p)){
                System.out.println(h+"    "+p);
                s.add(words.get(i));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("mom");
        s.add("mahm");
        s.add("kyk");
        List<String> n = matchSpecificPattern(s ,s.size(),"nin" );
        System.out.println(n);
    }
}
