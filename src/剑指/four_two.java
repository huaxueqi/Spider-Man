package 剑指;

import java.util.ArrayList;

public class four_two {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        // 定义左右两个指针
        int left = 1, right = 2;
        while (left < right) {
            // 等差数列求和
            int curSum = (left + right) * (right - left + 1) / 2;
            if (curSum == sum) {
                ArrayList<Integer> oneRes = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    oneRes.add(i);
                }
                res.add(oneRes);
                left++;
            } else if (curSum > sum) {
                // 当前和大于sum，所以left右移
                left++;
            } else {
                // 当前和小于sum，所以right右移
                right++;
            }
        }
        return res;
    }
}
