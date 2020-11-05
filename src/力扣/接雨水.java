package 力扣;

import static java.lang.Math.max;

public class 接雨水 {
    /**
     * 42. 接雨水
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     */
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(接雨水.trap(a));
    }

    static int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0, right = height.length - 1;
        int ans = 0;

        int l_max = height[left];
        int r_max = height[right];

        while (left <= right) {
            l_max = max(l_max, height[left]);
            r_max = max(r_max, height[right]);

            // ans += min(l_max, r_max) - height[i]
            if (l_max < r_max) {
                ans += l_max - height[left];
                left++;
            } else {
                ans += r_max - height[right];
                right--;
            }
        }
        return ans;
    }

}
