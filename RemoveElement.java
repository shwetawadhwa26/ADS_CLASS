import java.util.Arrays;

public class RemoveElement {

    
    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newIndex] = nums[i]; 
                newIndex++; 
            }
        }
        return newIndex; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3; 

        System.out.println("Original array: " + Arrays.toString(nums));

        int newLength = removeElement(nums, val);
        
        
        System.out.println("Array after removing element " + val + ": " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New length of the array: " + newLength);
    }
}