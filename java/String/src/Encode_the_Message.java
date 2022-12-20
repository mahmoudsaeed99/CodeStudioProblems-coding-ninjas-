public class Encode_the_Message {
    public static String encode(String message) {
        int n = message.length();
        String s = "";
        int c = 1;
        int i = 0;
        while(i < n-1){
            if(message.charAt(i) == message.charAt(i+1)){
                c++;
            }else{
                s += message.charAt(i)+"";
                s += c + "";
                c = 1;
            }
            i++;
        }
        s += message.charAt(i)+"";
        s += c + "";
        return s;
    }
    public static void main(String[] args) {
        String s = encode("mmahhh");
        System.out.println(s);
    }
}
