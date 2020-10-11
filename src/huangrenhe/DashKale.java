package huangrenhe;

import 力扣.demo7;

public class DashKale {
    public static void main(String[] args) {
        Demo_ListNode.ListNode l1=new Demo_ListNode.ListNode(1);
        Demo_ListNode.ListNode l2=new Demo_ListNode.ListNode(2);
        Demo_ListNode.ListNode l3=new Demo_ListNode.ListNode(3);
        Demo_ListNode.ListNode l4=new Demo_ListNode.ListNode(4);
        Demo_ListNode.ListNode l5=new Demo_ListNode.ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        int k=3;
        Integer Q = DashKale.kthToLast(l1,k);
        if (Q==null){
            System.out.println("为空");
        }else {
            System.out.println(Q);
        }

    }
    public static Integer kthToLast(Demo_ListNode.ListNode head,int k){
        Demo_ListNode.ListNode p,q;
        p=q=head;
        int i=0;
        for (i=0;p!=null;i++){
            if (i>=k){
                q=q.next;
            }
            p=p.next;
        }
        return i<k ? null : q.val;
    }

}
