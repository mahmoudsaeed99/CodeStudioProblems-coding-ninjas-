public class Anagram_Difference {
    public static int getMinimumAnagramDifference(String str1, String str2) {
        int c = 0;
        int[] char_count = new int[26];
        for (int i = 0 ; i < 26 ; i++){
            char_count[i] = 0;
        }
        for (int i = 0 ; i < str1.length() ; i++){
            int c1 = str1.charAt(i);
            int c2 = str2.charAt(i);
            char_count[c1-(int)'a']  +=1;
            char_count[c2-(int)'a']  -=1;
        }
        for (int i = 0 ; i < 26 ; i++){
            if (char_count[i] != 0){

                c += Math.abs(char_count[i]);
            }
        }
        return c/2;
    }
    public static void main(String[] args) {
        int w =  getMinimumAnagramDifference("except","accept");
        System.out.println(w);
    }
}
