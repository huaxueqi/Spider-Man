package 剑指;

/**
 * 输入一个链表，输出该链表的倒数第K个节点
 * 快慢指针
 */
public class fifteen {
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
        int k=1;
        ListNode Q=fifteen.solution(l1,k);
        if(Q == null)
            System.out.println("为空");
        else
            System.out.println(Q.val);
    }
    public static ListNode solution(ListNode node,int k){
        ListNode p,q;
        p=q=node;
        int i=0;
        for(;p!=null;i++){
            if(i>=k)
                q=q.next;
            p=p.next;
        }
        return i<k ? null : q;
    }
}

