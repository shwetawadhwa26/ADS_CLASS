import java.util.*;
public class RunSum {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

public static void main(String[] args) {
    // Test Running Sum
    int[] nums1 = {1, 2, 3, 4};
    System.out.println("Running Sum: " + Arrays.toString(runningSum(nums1)));
}
}
