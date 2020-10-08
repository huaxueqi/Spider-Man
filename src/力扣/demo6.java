package 力扣;



import java.util.HashSet;
import java.util.Set;

public class demo6 {

    //移除未排序链表中的重复节点。保留最开始出现的节点。
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
        ListNode Q= demo6.removeDuplicateNodes(l1);
        while( Q != null){
            System.out.print(Q.val+"   ");
            Q= Q.next;
        }
    }
    public static ListNode removeDuplicateNodes(ListNode head) {
        Set set= new HashSet();
        set.add(head.val);
        ListNode tmp=head;
        while(tmp.next != null){
         if(set.contains(tmp.next.val)){
             tmp.next=tmp.next.next;
         }else{
             set.add(tmp.next.val);
             tmp=tmp.next;
         }
      }
        return head;
    }
}
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
