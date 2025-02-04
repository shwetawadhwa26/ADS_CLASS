public class missingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        missingNum solution = new missingNum();

     
        int[] nums = {0, 1, 3};
        int missing = solution.missingNumber(nums);

        System.out.println("The missing number is: " + missing);
    }
}
