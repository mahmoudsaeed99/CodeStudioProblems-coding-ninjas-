public class Convert_String {
    public static String convertString(String str) {
        String[] s = str.split(" ");
        for (int i = 0 ; i < s.length ; i++){
            System.out.println(s[i].charAt());
        }
    }
    public static void main(String[] args) {
        System.out.println("hi");
    }
}
