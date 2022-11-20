public class Second_largest_element_in_the_array {
    public static int findSecondLargest(int n, int[] arr) {
        int maxnum = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1 ; i< arr.length ; i++){
            if(arr[i]>maxnum && secondMax<arr[i]){
                secondMax = maxnum;
                maxnum = arr[i];
            }else if(secondMax<arr[i] && arr[i]<maxnum){
                secondMax = arr[i];
            }

        }
        return secondMax == Integer.MIN_VALUE ? -1:secondMax;
    }
    public static void main(String[] args) {

    }
}
