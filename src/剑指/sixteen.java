package 剑指;

import java.util.ArrayList;

/**
 * 输入一个链表。反转链表后，输出表头
 */
public class sixteen {
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
        ListNode Q=sixteen.solution(l1);
        while( Q != null){
            System.out.print(Q.val+"   ");
            Q= Q.next;
        }

    }
    public static ListNode solution(ListNode node){
        ArrayList arrayList=new ArrayList();
        if(node == null)
            return null;
        ListNode pre =null;
        ListNode tmp =null;
        while(node != null){
           tmp=node.next;
           node.next=pre;
           pre=node;
           node=tmp;
        }
        return pre;
    }
}
