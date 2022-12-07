import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    public static char firstNonRepeating(String str) {
        HashMap<Character , Integer> h = new HashMap<>();
        ArrayList<Character> c = new ArrayList<>();
        for (int i = 0 ; i < str.length() ; i++){
            if(!h.containsKey(str.charAt(i))){
                h.put(str.charAt(i) , 1);
                c.add(str.charAt(i));
            }else{
                h.put(str.charAt(i) , h.get(str.charAt(i))+1);
            }
        }

        for (int i = 0 ; i < c.size() ; i++){
            if(h.get(c.get(i)) == 1 ){
                return c.get(i);
            }
        }
        return '#';
    }
    public static void main(String[] args) {
        char c = firstNonRepeating("jxvcfeohzyklwtbacnljbopuhlcvawtm");
        System.out.println(c);
    }
}
