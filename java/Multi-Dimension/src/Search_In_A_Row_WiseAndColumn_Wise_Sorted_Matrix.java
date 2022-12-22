public class Search_In_A_Row_WiseAndColumn_Wise_Sorted_Matrix {

//problem link:
//    https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381898

    static class Pair{
        int x; int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static Pair search(int[][] matrix, int x) {
        Pair p = new Pair(-1,-1);
        int r = 0 , c = matrix.length -1 ;
        while (r < matrix[0].length && c >= 0){
            if (matrix[r][c] == x){
                p.x = r;
                p.y = c;
                break;
            } else if (matrix[r][c] > x) {
                c--;
            }else{
                r++;
            }

        }
        return p;
    }


    public static void main(String[] args) {
        int[][] m ={{1,2,5},{3,4,9},{6,7,10}};
        Pair r = search(m , 4);
        System.out.println(r.x +"   "+r.y);


    }
}
