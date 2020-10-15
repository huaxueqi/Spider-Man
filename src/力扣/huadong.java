package 力扣;

import java.util.Arrays;

public class huadong {
    // 滑动窗口
    public static void main(String[] args) {
  int[] a ={1,3,-1,-3,5,3,6,7};
      System.out.println(Arrays.toString(huadong.maxSlidingWindow(a,3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        // 双重循环，暴力，算法复杂度为O(nk)
        int len = nums.length;
        int size = len > k ? len - k + 1 : 1;   // 求出结果数组的大小
        int[] res = new int[size];

        // 双重循环
        for(int i = 0; i < size; i++){
            int max = nums[i];
            for(int j = i; j < k+i && j < len; j++){
                max = Math.max(max, nums[j]);
            }
            res[i] = max;
        }
        return res;

    }

}
