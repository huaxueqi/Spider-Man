package 力扣;


public class demo7 {
    //实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        int k=3;
        Integer Q= demo7.kthToLast(l1,k);
        if( Q == null)
            System.out.println("为空");
        else
            System.out.println(Q);
       ListNode Q1= demo7.kthToLast1(l1);
        while( Q1 != null){
            System.out.print(Q1.val+"   ");
            Q1= Q1.next;
        }
    }
    public static Integer kthToLast(ListNode head, int k) {
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k)
                q = q.next;
            p = p.next;
        }
        return i < k ? null : q.val;
    }

    public static ListNode kthToLast1(ListNode head) {
        ListNode p, q;
        p = head;
        q=head.next.next;
        while(q.next !=null && q.next.next !=null){
            p=p.next;
            q=q.next.next;
        }
        p.next=p.next.next;
        return head;
    }
}
