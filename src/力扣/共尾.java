package 力扣;

public class 共尾 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        ListNode r1=new ListNode(1);
        ListNode r2=new ListNode(2);
        ListNode r3=new ListNode(2);
        ListNode r4=new ListNode(4);
        ListNode r5=new ListNode(6);
        r1.next=r2;
        r2.next=r3;
        r3.next=r4;
        r4.next=r5;

        System.out.println(共尾.getIntersectionNode(l1,r1).val);

    }

        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode node1 = headA, node2 = headB;
            while (node1 != node2) {
                node1 = node1 != null ? node1.next : headB;
                node2 = node2 != null ? node2.next : headA;
            }
            return node1;
        }


}
