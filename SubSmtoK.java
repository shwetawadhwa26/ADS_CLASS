import java.util.*;
public class SubSmtoK{
    public static int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int count = 0, sum = 0;
    for (int num : nums) {
        sum += num;
        count += map.getOrDefault(sum - k, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
    }
    public static void main(String[] args) {
        int[] nums8 = {1, 1, 1};
        int k2 = 2;
        System.out.println("Subarray Sum Equals K: " + subarraySum(nums8, k2));
}
}