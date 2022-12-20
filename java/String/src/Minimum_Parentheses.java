public class Minimum_Parentheses {
    public static int minimumParentheses(String pattern) {
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < pattern.length(); ++i) {

            bal += pattern.charAt(i) == '(' ? 1 : -1;

            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }

        return bal + ans;
    }
    public static void main(String[] args) {
        int n = minimumParentheses(")((()");
        System.out.println(n);
    }
}
