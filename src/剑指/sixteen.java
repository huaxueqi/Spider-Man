package 剑指;

/**
 * 输入一个链表。反转链表后，输出表头
 */
public class sixteen {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode Q = sixteen.solution(l1);
        while (Q != null) {
            System.out.print(Q.val + "   ");
            Q = Q.next;
        }

    }

    public static ListNode solution(ListNode node) {
        if (node == null)
            return null;
        ListNode pre = null;
        while (node != null) {
            ListNode tmp = node.next;  //t=a
            node.next = pre;           //a=b
            pre = node;                //b=t
            node = tmp;
        }
        return pre;
    }
}
