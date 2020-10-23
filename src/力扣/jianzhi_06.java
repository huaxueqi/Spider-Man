package 力扣;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class jianzhi_06 {
    /**
     *输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     */
    public static void main(String[] args) {

    }
    public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }
            int[] res = new int[stack.size()];
            for (int i = 0; i < res.length; i++)
                res[i] = stack.pop();
            return res;
        }

     List<Integer> tmp = new ArrayList<>();
    public int[] reversePrint1(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }


}
