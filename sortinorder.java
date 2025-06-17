
import java.util.Arrays;
public class sortinorder {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 7, 10 };
        int n = arr.length;

        // Step 1: Partition the array (odds first, evens later)
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                // Swap arr[i] with arr[oddCount]
                int temp = arr[i];
                arr[i] = arr[oddCount];
                arr[oddCount] = temp;
                oddCount++;
            }
        }

        // Step 2: Sort odd part in descending order
        Arrays.sort(arr, 0, oddCount);
        reverse(arr, 0, oddCount - 1); // In-place reverse

        // Step 3: Sort even part in ascending order
        Arrays.sort(arr, oddCount, n);

        // Step 4: Print the result
        System.out.print("Output: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // Helper to reverse part of array in-place
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
}
