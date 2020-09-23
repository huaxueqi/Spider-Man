package 力扣;


public class demo8 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(2);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(2);
        ListNode l7=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;

        ListNode Q =  demo8.partition(l1,3);
        while (Q != null) {
            System.out.print(Q.val + "   ");
            Q = Q.next;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) { //头不用扫描
            if (cur.next.val < x) {
                ListNode nextNode = cur.next;
                cur.next = nextNode.next;
                nextNode.next = head;
                head = nextNode;
            } else {
                cur = cur.next; //下一步
            }
        }
        return head;
    }
}
