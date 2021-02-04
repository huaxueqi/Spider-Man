package 力扣;

public class 连续数列 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cursum <= 0) {
                cursum = nums[i];
            } else {
                cursum += nums[i];
            }
            if (cursum > maxsum) {
                maxsum = cursum;
            }
        }
        return maxsum;
    }
}
