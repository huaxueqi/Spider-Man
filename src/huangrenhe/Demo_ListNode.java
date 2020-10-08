package huangrenhe;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import java.util.HashSet;
import java.util.Set;

public class Demo_ListNode {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        ListNode Q = Demo_ListNode.removeDuplicateNodes(listNode1);
        while (Q!=null){
            System.out.println(Q.val+"");
            Q=Q.next;
        }

    }

    public static ListNode removeDuplicateNodes(ListNode listNode){
        if (listNode==null){return null;}
        ListNode pre = null;
        while (listNode!=null){
            ListNode tmp = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = tmp;
        }
        return pre;
    }
}
