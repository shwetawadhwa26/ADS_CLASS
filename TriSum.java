import java.util.Arrays;

public class TriSum {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        TriSum solution = new TriSum();

      
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = solution.threeSumClosest(nums, target);

        System.out.println("The sum closest to the target is: " + result);
    }
}
