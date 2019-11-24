package 剑指;

public class fifty_six {
    public static void main(String[] args) {

    }
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.val==fast.val){//有环
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

}
