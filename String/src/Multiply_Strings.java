import java.util.ArrayList;

public class Multiply_Strings {
    public static String multiplyStrings(String a, String b) {
        int z = 0;
        ArrayList<String> arr = new ArrayList<>();
        int maxSize = -1;
        for (int i = a.length() -1 ; i >= 0 ; i--){
            String n = "";
            n += Integer.parseInt(String.valueOf(a.charAt(i))) * Integer.parseInt(b);
            n += "0".repeat(z);
            z++;
            arr.add(n);
            maxSize = n.length() > maxSize ? n.length() : maxSize;
        }
        String s1 = "0".repeat(maxSize - arr.get(0).length()) + arr.get(0);
        for (int i = 1 ; i < arr.size() ; i++){
            String s2 = "0".repeat(maxSize - arr.get(i).length()) + arr.get(i);
            int c = 0;
            String s = "";
            for (int j = s1.length() - 1 ; j >= 0 ; j--){
                int summ = Integer.parseInt(String.valueOf(s1.charAt(j))) + Integer.parseInt(String.valueOf(s2.charAt(j)));
                summ += c;
//                System.out.println(summ);
                if (summ >= 10){
                    s = summ % 10 + s;
                    c = 1;
                }else{
                    s = summ + s;
                    c = 0;
                }
//                System.out.println(s);
            }
            s1 = c != 0 ? 1 + s : s;
        }
        return s1;
    }
    public static void main(String[] args) {
        String a = "17281";
        String b = "91276";
        String s = multiplyStrings(a , b);
//        System.out.println("0".repeat(0));
    }

}
