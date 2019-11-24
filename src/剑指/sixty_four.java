package 剑指;

import java.util.Comparator;
import java.util.PriorityQueue;

public class sixty_four {
    public static void main(String[] args) {

    }

    // java 默认小顶堆
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    // 大顶堆需要重写比较函数
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    int count = 0;


    public void Insert(Integer num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if ((count & 1) == 1) {
            return new Double(minHeap.peek());
        } else {
            return new Double(minHeap.peek() + maxHeap.peek())/2;
        }
    }

}
