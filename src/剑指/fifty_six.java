package 剑指;

public class fifty_six {
    /**
     * 判断链表是否有环
     * @param args
     */
    public static void main(String[] args) {

    }
    //有问题
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.val!=null ||fast.val != null){//有环
                slow = pHead;//其中一个退回到出发点
                while(slow.val!=fast.val){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;//走到这步说明无环
    }

   //正确答案
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode l=head;
        ListNode r=head.next;
        while(l != r){
            if(r==null || r.next == null){
                return false;
            }
            l=l.next;
            r=r.next.next;
        }
        return true;
    }
}
