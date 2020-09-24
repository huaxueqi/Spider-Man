package 力扣;


public class demo8 {
    /**
     *     编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。
     *     如果链表中包含 x，x
     *     只需出现在小于 x 的元素之后(如下所示)。分割元素 x 只需处于“右半部分”即可，
     *     其不需要被置于左右两部分之间。
     */


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

        ListNode Q =  demo8.partition1(l1,3);
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
    public static ListNode partition1(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode left,rigth;
        left=rigth=head;
        while(left!=null){
          if(left.val<x){
              int t=left.val;
              left.val=rigth.val;
              rigth.val=t;
              rigth=rigth.next;
          }
          left=left.next;
        }
        return head;
    }

}
