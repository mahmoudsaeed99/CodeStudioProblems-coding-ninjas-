public class Summed_Matrix {
    public static long query(long n , long q)
    {
        if (q < n+1){
            return q-1;
        }
        return n - (q % (n+1));

    }

    public static void main(String[] args) {
        long res = query(3,4);
        System.out.println(res);

    }
}
