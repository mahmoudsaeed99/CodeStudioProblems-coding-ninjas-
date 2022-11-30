public class Left_And_Right_Rotation_Of_A_String {
    public static String leftRotate(String str, int d) {
        if (d >= str.length()){
            d = d % str.length();
        }
        if (d == 0){
            return str;
        }
        String s = "";
        int i = str.length() - (str.length() - d);
//        System.out.println(str.substring(i,str.length()));
        s += str.substring(i,str.length()) + str.substring(0,d);

        return s;
    }

    public static String rightRotate(String str, int d) {
        if (d >= str.length()){
            d = d % str.length();
        }
        if (d == 0){
            return str;
        }
        String s = "";
        int i = str.length() - d;
        s+= str.substring(i , str.length()) + str.substring(0,i);
        return s;
    }
    public static void main(String[] args) {
        String l = leftRotate("abc",4);
        String r = rightRotate("abc" , 4);
        System.out.println(l+ "  "+r);
    }
}
