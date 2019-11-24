package 剑指;

public class fifty_seven {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null || pHead.next==null){return pHead;}
        ListNode Head = new ListNode(-1);
        Head.next = pHead;
        ListNode pre  = Head;
        ListNode last = Head.next;
        while (last!=null){
            if(last.next!=null && last.val == last.next.val){
                // 找到最后的一个相同节点
                while (last.next!=null && last.val == last.next.val){
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else{
                pre = pre.next;
                last = last.next;
            }
        }
        return Head.next;    }
}
