public class Pos{
    public static int minStartValue(int[] nums) {
        int minSum = 0, currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            minSum = Math.min(minSum, currentSum);
        }
        return 1 - minSum;
    }
    public static void main(String[] args) {
        int[] nums4 = {-3, 2, -3, 4, 2};
        System.out.println("Minimum Start Value: " + minStartValue(nums4));
    }
}