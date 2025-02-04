import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array: " + Arrays.toString(nums));

        int newLength = removeDuplicates(nums);
        
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New length of the array: " + newLength);
    }
}