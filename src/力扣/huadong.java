package 力扣;

import java.util.ArrayDeque;
import java.util.Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

public class huadong {
    /**
     * 剑指 Offer 59 - I. 滑动窗口的最大值
     * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
     */
    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(huadong.b(a, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // 双重循环，暴力，算法复杂度为O(nk)
        int len = nums.length;
        int size = len > k ? len - k + 1 : 1;   // 求出结果数组的大小
        int[] res = new int[size];

        // 双重循环
        for (int i = 0; i < size; i++) {
            int max = nums[i];
            for (int j = i; j < k + i && j < len; j++) {
                max = Math.max(max, nums[j]);
            }
            res[i] = max;
        }
        return res;

    }

    static int[] b(int[] nums, int k) {
        if(nums.length==0) return new int [0];
        int len=nums.length;
        int size=len-k+1;
        int[] res =new int [size];
        for(int i=0;i<size;i++){
            if(i !=0 && res[i-1] != nums[i-1]){
                res[i]=max(res[i-1],nums[i+k-1]);
            }else{
                int max=nums[i];
                for(int j=i;j<len && j<k+i;j++){
                    max=max(max,nums[j]);
                }
                res[i]=max;
            }
        }
        return res;
    }


    public static int[] maxSlidingWindow1(int[] nums, int k) {
        // 非空判断
        if (nums == null || k <= 0) return new int[0];
        // 最终结果数组
        int[] res = new int[nums.length - k + 1];
        // 存储的数据为元素的下标
        ArrayDeque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < nums.length; i++) {
            // 1.移除左边超过滑动窗口的下标
            if (i >= k && (i - k) >= deque.peek()) deque.removeFirst();

            // 2.从最后面开始移除小于 nums[i] 的元素
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.removeLast();

            // 3.下标加入队列
            deque.offer(i);

            // 4.将最大值加入数组
            int rindex = i - k + 1;
            if (rindex >= 0) {
                res[rindex] = nums[deque.peek()];
            }
        }
        return res;
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // 双重循环，暴力，算法复杂度为O(nk)
        int len = nums.length;
        int size = len > k ? len - k + 1 : 1;   // 求出结果数组的大小
        int[] res = new int[size];

        int max;
        // 双重循环
        for (int i = 0; i < size; i++) {

            // 如果丢弃的元素并不是上次窗口的最大值,
            // 只需要把上次窗口最大值和此次移动增加的新值比较，更新最大值即可
            if (i != 0 && res[i - 1] != nums[i - 1]) {
                res[i] = Math.max(res[i - 1], nums[i + k - 1]);
            } else {
                max = nums[i];
                for (int j = i; j < k + i && j < len; j++) {
                    max = Math.max(max, nums[j]);
                }
                res[i] = max;
            }
        }
        return res;
    }


}
