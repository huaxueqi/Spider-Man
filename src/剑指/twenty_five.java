package 剑指;

/**
 * 输入一个复杂链表，返回结果为复制后的复杂链表head
 */

public class twenty_five {
    public static void main(String[] args) {
        RandomListNode root = new RandomListNode(1);
        RandomListNode node1 = new RandomListNode(2);
        RandomListNode node2 = new RandomListNode(3);
        RandomListNode node3 = new RandomListNode(4);
        RandomListNode node4 = new RandomListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        root.random = node1;
        node1.random = root;
        node3.random = node1;
        root.next=node2;

        twenty_five t=new twenty_five();
        RandomListNode tmp=t.Clone(root);
        while(tmp != null){
            System.out.print(tmp.label+"  ");
            tmp=tmp.random;
        }
    }
  public  RandomListNode Clone(RandomListNode pHead){
        if(pHead == null){
            return null;
        }
        RandomListNode head=new RandomListNode(pHead.label);
        RandomListNode tmp=head;
        while(pHead != null){
            if(pHead.next != null){
                tmp.next=new RandomListNode(pHead.next.label);
            }
            if(pHead.random != null){
                tmp.random=new RandomListNode(pHead.random.label);
            }
            tmp=tmp.next;
            pHead=pHead.next;
        }
        return head;
  }
}
 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
    RandomListNode(int label) {
        this.label = label;
    }
}