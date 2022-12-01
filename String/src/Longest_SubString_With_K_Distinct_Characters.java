import java.util.HashSet;
import java.util.Set;

public class Longest_SubString_With_K_Distinct_Characters {
    public static int getLengthofLongestSubstring(String s, int k) {
        int max_count = -1;
        for (int i = 0 ; i < s.length() ; i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
//            System.out.println(s.charAt(i));
            int j = i+1;
            int current_count = 1;
            while (j < s.length()){
//                System.out.println(s.charAt(j));
                set.add(s.charAt(j));
                if(set.size() <= k){
                    current_count++;
                }else{
                    break;
                }
                j++;
            }
//            System.out.println(current_count+"   "+max_count);
//            System.out.println("---------------------");
            max_count = current_count > max_count ? current_count:max_count;
        }
        return max_count;
    }
    public static void main(String[] args) {
        int i = getLengthofLongestSubstring("acbdab" , 3);
        System.out.println(i);
    }
}
