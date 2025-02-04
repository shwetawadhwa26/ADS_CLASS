import java.util.*;
public class KlargeSmall{
    public static int findKthSmallest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }
    public static void main(String[] args) {
        int[] nums9 = {3, 2, 1, 5, 6, 4};
        int k3 = 2;
        System.out.println("Kth Smallest Element: " + findKthSmallest(nums9, k3));
}
}