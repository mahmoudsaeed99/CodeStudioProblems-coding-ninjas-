import java.util.ArrayList;

//problem link :
//        https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376581

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int m = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if (arr.contains(s.charAt(i))){
                m = arr.size() > m ? arr.size() : m;
                while(arr.contains(s.charAt(i))){
                    arr.remove(0);
                }
            }
            arr.add(s.charAt(i));
        }
        m = arr.size() > m ? arr.size() : m;
        return m;
    }
    public static void main(String[] args) {
        String s = " abc 342 ()&*5 xyz  ";
        int r = lengthOfLongestSubstring(s);
        System.out.println(r);
    }
}
