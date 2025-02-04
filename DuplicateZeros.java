import java.util.Arrays;

public class DuplicateZeros {

   
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int countZeros = 0;

       
        for (int num : arr) {
            if (num == 0) {
                countZeros++;
            }
        }

      
        for (int i = n - 1, j = n + countZeros - 1; i >= 0; i--) {
            if (j < n) {
                arr[j] = arr[i]; 
            }
            if (arr[i] == 0) {
                j--; 
                if (j < n) {
                    arr[j] = 0; 
                }
            }
            j--; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Original array: " + Arrays.toString(arr));

        duplicateZeros(arr);
        
        System.out.println("Array after duplicating zeros: " + Arrays.toString(arr));
    }
}