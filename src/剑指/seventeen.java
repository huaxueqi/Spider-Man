package 剑指;

/**
 * 输入两个单调递增的链表，输出合并后的链表，并满足单调递增原则
 */
public class seventeen {
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
        ListNode l6=new ListNode(2);
        ListNode l7=new ListNode(3);
        ListNode l8=new ListNode(4);
        ListNode l9=new ListNode(5);
        ListNode l10=new ListNode(6);
        l6.next=l7;
        l7.next=l8;
        l8.next=l9;
        l9.next=l10;
       ListNode Q= seventeen.Merge(l1,l6);
       //ListNode p= seventeen.solution(l1,l6);
      while(Q != null){
           System.out.print(Q.val+" ");
           Q=Q.next;
       }
       /* while(p != null){
            System.out.print(p.val+" ");
            p=p.next;
        }*/
    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node =new ListNode();
        ListNode tmp=node;
        while(list1 != null && list2 != null){
            if((int)list1.val < (int)list2.val){
                tmp.next=list1;
                list1=list1.next;
            }else{
                tmp.next=list2;
                list2=list2.next;
            }
            tmp=tmp.next;
        }
        tmp.next= (list1 == null) ?list2 :list1;
        return node.next;
    }
    public static ListNode solution(ListNode l1,ListNode l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if((int)l1.val < (int)l2.val){
        l1.next=solution(l1.next,l2);
        return  l1;
        }else{
            l2.next=solution(l1,l2.next);
            return l2;
        }
    }
}
