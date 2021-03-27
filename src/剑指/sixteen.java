package 剑指;

/**
 * 输入一个链表。反转链表后，输出表头
 */
public class sixteen {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode Q = sixteen.a(l1);
        while (Q != null) {
            System.out.print(Q.val + "   ");
            Q = Q.next;
        }
    }

    public static ListNode solution(ListNode node) {
        if (node == null)
            return null;
        ListNode pre = null;
        while (node != null) {
            ListNode tmp = node.next;  //t=a
            node.next = pre;           //a=b
            pre = node;                //b=t
            node = tmp;
        }
        return pre;
    }
    static ListNode a(ListNode node){
       if(node ==null)
           return null;
       ListNode pre=null;
       while(node != null){
           ListNode tmp=node.next;
           node.next=pre;
           pre=node;
           node=tmp;
       }
       return pre;
    }


    public static ListNode revertList(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode pre = revertList(node.next);//从下一个节点开始递归
        node.next.next = node;//设置下一个节点的next 为当前节点
        node.next = null;//把当前节点的next 设置为空，避免循环引用
        return pre;
    }


}
