public class Minage{
    public static int minimumAverageDifference(int[] nums) {
        long totalSum = 0, leftSum = 0;
        for (int num : nums) totalSum += num;
        int minIndex = 0;
        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;
            long avgLeft = leftSum / (i + 1);
            long avgRight = (i == nums.length - 1) ? 0 : rightSum / (nums.length - i - 1);
            long diff = Math.abs(avgLeft - avgRight);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

}