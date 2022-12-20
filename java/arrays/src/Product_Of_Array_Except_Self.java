import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    public static int[] getProductArrayExceptSelf(int[] arr) {
        if(arr.length == 0){
            return arr;
        }
        int sum = arr[0] == 0 ? 1 : arr[0];
        int count0 = arr[0] == 0 ? 1 : 0;
        for (int i = 1; i < arr.length ; i++){
            if(arr[i] == 0){
                count0++;
            }
            else{
                sum *= arr[i];
            }
            if(count0 > 1){
                break;
            }
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (count0 > 1){
                arr[i] = 0;
            } else if (count0 == 1) {
                arr[i] = arr[i] == 0?sum:0;
            }else{
                arr[i] = sum / arr[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1000,1};
        int[] a2 = getProductArrayExceptSelf(a);
        System.out.println(Arrays.toString(a2));
//        int i = 0;
//        int sum = 1;
//        sum *= i==0?1:3;
//        System.out.println(sum/0);
    }
}
