package 剑指;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class thirty_seven {
    public static void main(String[] args) {

    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Map<ListNode,Integer> map= new HashMap<>();
        while(pHead1 != null){
            map.put(pHead1,1);
            pHead1 =pHead1.next;
        }
        while(pHead2 != null){
            if(map.containsKey(pHead2)){
                return pHead2;
            }else{
                pHead2=pHead2.next;
            }
        }
        return null;
    }

    }
