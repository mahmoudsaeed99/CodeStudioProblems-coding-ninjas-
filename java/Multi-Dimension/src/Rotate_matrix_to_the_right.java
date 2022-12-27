import java.util.Arrays;

//problem link:
//    https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381903


public class Rotate_matrix_to_the_right {
    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        int[][] res = new int[n][m];
        if (k % m == 0){
            return mat;
        }
        k = k % m;
        int c = 0;
        while(c < m){
            if (k == m){
                k = 0;
            }
            for (int i = 0 ; i < n ; i++){
                res[i][k] = mat[i][c];
            }
            c++;
            k++;
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = rotateMatRight(mat , n , m , 4);
        for (int i = 0 ; i < res.length ; i++){
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
