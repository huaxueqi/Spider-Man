package 力扣;

public class demo9 {
    /**
     * 链表求和
     * 给定两个用链表表示的整数，每个节点包含一个数位。
     * <p>
     * 这些数位是反向存放的，也就是个位排在链表首部。
     * <p>
     * 编写函数对这两个整数求和，并用链表形式返回结果。
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;
        ListNode Q = demo9.addTwoNumbers(l1, l4);
        while (Q != null) {
            System.out.print(Q.val + "   ");
            Q = Q.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode sumList = new ListNode(0);
        ListNode tail = sumList;

        while (l1 != null || l2 != null) {
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);

            add = s / 10;
            tail.next = new ListNode(s % 10);
            tail = tail.next;
        }
        if (add != 0)
            tail.next = new ListNode(add);
        return sumList.next;
    }
}
