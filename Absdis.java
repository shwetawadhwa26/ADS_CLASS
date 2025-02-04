 
 public class Absdis{
 public static int[] getAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += Math.abs(nums[i] - nums[j]);
            }
        }
        return result;
    }
}