

public class RemoveConsecutiveDuplicatesFromString {
    public static String removeConsecutive(String str)
    {
        String s = "";
        int i = 0;
        while(i < str.length()-1){
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(i+1))){
                s += str.charAt(i)+"";
            }
            i++;
        }
        s += str.charAt(i)+"";
        return s;

    }
    public static void main(String[] args) {
        String s = "xxxyyyzwwzzz";
        String r = removeConsecutive(s);
        System.out.println(r);
    }
}
