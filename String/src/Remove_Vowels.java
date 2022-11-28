import java.util.Arrays;
import java.util.List;

public class Remove_Vowels {
    public static String removeVowels(String str) {
        List<Character> s = Arrays.asList('a', 'e', 'o', 'i', 'u');
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            Character c = Character.toLowerCase(str.charAt(i));
            if (! s.contains(c)) {
                new_str += str.charAt(i)+"";
            }
        }
        return new_str;
    }
    public static void main(String[] args) {
        String s = removeVowels("mahmoud");
        System.out.println(s);
    }
}
