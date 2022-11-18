import java.util.ArrayList;
import java.util.Arrays;

public class Count_all_sub_arrays_having_sum_divisible_by_k {
    public static int subArrayCount(ArrayList < Integer > arr, int k) {
        int mod[] = new int[k];
        Arrays.fill(mod, 0);

        // Traverse original array and compute cumulative
        // sum take remainder of this current cumulative
        // sum and increase count by 1 for this remainder
        // in mod[] array
        int cumSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            cumSum += arr.get(i);

            // as the sum can be negative, taking modulo twice
            mod[((cumSum % k) + k) % k]++;
        }

        // Initialize result
        int result = 0;

        // Traverse mod[]
        for (int i = 0; i < k; i++)

            // If there are more than one prefix subarrays
            // with a particular mod value.
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;

        // add the elements which are divisible by k itself
        // i.e., the elements whose sum = 0
        result += mod[0];

        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(1);
//        arr.add(3);
//        arr.add(1);
        System.out.println(subArrayCount(arr,5));

    }
}
