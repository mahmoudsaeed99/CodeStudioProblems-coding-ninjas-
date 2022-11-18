public class Search_In_Rotated_Sorted_Array {
        //function to find the pivot element of the rotation
        public static int pivot(int[] arr){

            int start=0;
            int end=arr.length-1;
            int ans=-1;

            while(end>=start){

                int mid=start+(end-start)/2;

                if(mid!=end && arr[mid]>arr[mid+1])
                    return mid;
                else if(mid!=0 && arr[mid-1]>arr[mid])
                    return mid-1;
                else if(arr[mid]>=arr[0]){
                    ans=mid;
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            return ans;
        }
        //function to search the key on the respective search space
        public static int binarySearch(int[] arr, int key, int start, int end){

            while(end>=start){

                int mid=start+(end-start)/2;

                if(key>arr[mid])
                    start=mid+1;
                else if(key<arr[mid])
                    end=mid-1;
                else
                    return mid;
            }
            return -1;
        }
        public static int search(int arr[], int key) {
            int pivot_element= pivot(arr);

            if(pivot_element==-1)//array is not rotated
                return binarySearch(arr, key, 0, arr.length-1);
            else if(key>=arr[0])//key will present on left side of the pivot element
                return binarySearch(arr, key, 0, pivot_element);
            else if(key<arr[0])//key will present of the right side fo the pivot element
                return binarySearch(arr, key, pivot_element+1, arr.length-1);
            return pivot_element;//key will equal to pivot element
        }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,-3,0};
        int r = search(arr , 0);
        System.out.println(r);
    }
}
