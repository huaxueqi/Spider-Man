package 力扣;

import java.util.Comparator;
import java.util.PriorityQueue;

public class solution_215 {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        //System.out.println(solution_215.findKthLargest(a, 2));
        solution_215.a(a);
    }

    public static int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int val : nums) {
            queue.add(val);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }

    static void a(int[] arr) {
        PriorityQueue queue1 = new PriorityQueue(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int val : arr) {
            queue1.offer(val);
        }
        System.out.println(queue1.peek());
    }
}
