import java.util.Arrays;

//problem link:
//    https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381904



public class Inplace_rotate_matrix_90_degree {
    public static void inplaceRotate(int[][] arr, int n) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[row-1-i][j];
                arr[row-1-i][j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;
        inplaceRotate(mat , n);
        for (int i = 0 ; i < mat.length ; i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
