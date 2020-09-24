package 栈;

public class LinkListNode {
    private Node top = null;
    private int maxSize = 0;
    private int len = 0;

    public LinkListNode(int initSize) throws Exception {
        if (initSize <= 0) throw new Exception("栈的容量不能小于等于0");
        top = null;
        maxSize = initSize;
        len = 0;
    }

    public boolean ifFull() {
        return len >= maxSize;
    }

    public boolean isEmpty() {
        return len <= 0;
    }

    public boolean push(Object val) throws Exception {
        if (this.ifFull()) {
            throw new Exception("容量已满");
        }
        top = new Node(val, top);
        len++;
        return true;
    }

    public Node pop() throws Exception {
        if (this.isEmpty())
            throw new Exception("栈是空");
        Node tmp = top;
        top = top.next;
        len--;
        return tmp;
    }

    public Node peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("空栈");
        }
        return top;
    }

    public static void main(String[] args) throws Exception {
        LinkListNode linkListNode = new LinkListNode(10);
        linkListNode.push("Hello");
        linkListNode.push("Java");
        System.out.println(linkListNode.peek().val);
        linkListNode.pop();
        System.out.println(linkListNode.pop().val);
    }
}

class Node {
    Object val;
    Node next;

    Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }
}
