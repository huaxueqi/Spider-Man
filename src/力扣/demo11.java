package 力扣;

public class demo11 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(demo11.isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        //翻转链表前部分，让他和后半部分对比
        while (fast != null && fast.next != null) {
            ListNode oldCur = slow;
            slow = slow.next;
            fast = fast.next.next;
            oldCur.next = prev;
            prev = oldCur;
        }
        if (fast != null) {
            // 链表个数为奇数
            slow = slow.next;
        }
        // 判断pre和slow是否相等
        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}
