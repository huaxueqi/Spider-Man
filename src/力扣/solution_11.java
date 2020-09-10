package 力扣;

public class solution_11 {
    //存最多的水
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        System.out.println(solution_11.maxArea(a));
    }
}

