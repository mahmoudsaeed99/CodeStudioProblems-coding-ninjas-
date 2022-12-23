public class Matrix_Is_Symmetric {
//problem link:
//    https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381899


    public static boolean isMatrixSymmetric(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0 ; i < matrix.length-1 ; i++){
            int r = i+1 , c = i+1;
            while (r < n && c < n){
                if (matrix[r][i] != matrix[i][c]){
                    return false;
                }
                r++;
                c++;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{2,4,5},{3,5,8}};
        boolean b = isMatrixSymmetric(m);
        System.out.println(b);
    }
}
