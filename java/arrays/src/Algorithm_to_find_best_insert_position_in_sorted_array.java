public class Algorithm_to_find_best_insert_position_in_sorted_array {
    public static int bestInsertPos(int [] arr, int n, int m){
        // Write your code here.
        int r = -1;
        if(n == 0){
            r = 0;
        }
        else if(m < arr[0]){
            return 0;
        }
        else if(m > arr[n-1]){
            return n;
        }
        else{
            int s = 0;
            int e = n-1;
            while(s <= e){
                int mid = s + (e-s)/2;
                if(m < arr[mid]){
                    e = mid-1;
                    r = mid;
                } else if (m > arr[mid]) {
                    s = mid+1;
                    r = s;
                }else{
                    r = mid;
                    break;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,10};
        int r = bestInsertPos(arr , arr.length ,6);
        System.out.println(r);
    }
}
